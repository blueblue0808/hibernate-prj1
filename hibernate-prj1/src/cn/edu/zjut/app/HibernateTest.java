package cn.edu.zjut.app;
import cn.edu.zjut.dao.*;
import cn.edu.zjut.po.*;
import cn.edu.zjut.service.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class HibernateTest {
    public static void main(String[] args) {
//        Customer loginUser = new Customer();
//        loginUser.setCustomerId(1);
//        loginUser.setAccount("zjut");
//        loginUser.setPassword("Zjut");
//        UserService uService =new UserService();
//        if(uService.login(loginUser))
//            System.out.println(loginUser.getAccount()+" login Success!");
//        else
//        System.out.println(loginUser.getAccount()+" login Fail!");

        List<Item> items ;
        ItemService iService = new ItemService();
        items = iService.findByHql();
//        for(Item i:items)
//            System.out.println(i.getItemID()+" "+i.getTitle()+" "+i.getDescription()+" "+i.getCost());
        for(Item i:items)
            System.out.println(i.getIpk().getItemID()+" "+i.getIpk().getTitle());

//        //只输出title
//        List<String> titles ;
//        ItemService iService = new ItemService();
//        titles = iService.findByHql();
//        for(String i:titles)
//            System.out.println(i);

//        //输出title和cost
//        List<Object[]> title_cost ;
//        ItemService iService = new ItemService();
//        title_cost = iService.findByHql();
//        for(Object[] i:title_cost){
//            String title1=(String)i[0];
//            Float cost1=(Float)i[1];
//            System.out.println(title1+cost1);
//        }




        //注册
//        Customer registerUser = new Customer();
//        ContactInfo con = new ContactInfo("15267169419", "17171717171@qq.com", "浙江工业大学屏峰校区",
//                "371000", "xxxx");
//        registerUser.setCustomerId(4);
//        registerUser.setAccount("blue");
//        registerUser.setPassword("Blue");
//        registerUser.setName("blueblue");
//        registerUser.setContactInfo(con);
//        UserService uService =new UserService();
//        if(uService.register(registerUser))
//            System.out.println(registerUser.getAccount()+" register Success!");
//        else
//            System.out.println(registerUser.getAccount()+" register Fail!");
    }
}