package cn.edu.zjut.po;
import java.sql.Blob;
public class Item {
    private ItemPK ipk;
//    private String itemID;
//    private String title;
    private String description;
    private float cost;
    public Item() {
    }
//    public Item(String itemID) {
//        this.itemID = itemID;
//    }
    public Item(ItemPK ipk) {
        this.ipk=ipk;
    }
//    public Item(String itemID, String title, String description,
//                float cost) {
//        this.itemID=itemID;
//        this.title=title;
//        this.description=description;
//        this.cost=cost;
//    }
    public Item(ItemPK ipk, String description,
                float cost) {
        this.ipk=ipk;
        this.description=description;
        this.cost=cost;
    }

//    public void setItemID(String itemID) {
//        this.itemID = itemID;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getItemID() {
//        return itemID;
//    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

//    public String getTitle() {
//        return title;
//    }

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }

    public ItemPK getIpk() {
        return ipk;
    }

    public void setIpk(ItemPK ipk) {
        this.ipk = ipk;
    }
}