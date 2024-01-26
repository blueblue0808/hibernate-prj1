package cn.edu.zjut.service;
import java.util.List;
import java.util.ArrayList;
import cn.edu.zjut.dao.ItemDAO;
import cn.edu.zjut.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class ItemService {
    private List items = new ArrayList();
    public Session getSession() {
        return HibernateUtil.getSession();
    }
    public List getAllItems() {
        Session session=this.getSession();
        ItemDAO dao = new ItemDAO();
        dao.setSession(session);
        List items = dao.findAll();
        HibernateUtil.closeSession();
        return items;
    }

    public List findByHql() {
        Session session=this.getSession();
        ItemDAO dao = new ItemDAO();
        dao.setSession(session);
//        String hql = "from cn.edu.zjut.po.Item";
//        String hql = "from Item as item";
//        String hql = "from Item";
//        String hql = "select item.ipk.title from Item as item";
//        String hql = "select item.ipk.title, item.cost from Item as item";
        String hql = "from Item as item " +
                "where item.cost>( " +
                " select avg(item1.cost) " +
                "from Item as item1)" +
                " order by item.cost desc";
        List list = dao.findByHql(hql);
        HibernateUtil.closeSession();
        return list;
    }
}
