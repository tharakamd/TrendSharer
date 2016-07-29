package trendsapps.org.trendsharer;


import android.util.Log;

public class HotDeal {
    private int ID;
    private String shop;
    private String discount;
    private String content = null;
    private int duration = 20;
    private boolean isPublishedByAnOwner = false;

    public HotDeal(){

    }
    public HotDeal(int ID,String shopName, String discount){
        this.ID = ID;
        this.shop = shopName;
        this.shop = discount;
    }

    public HotDeal(String shopName, String discount){
        this.shop = shopName;
        this.shop = discount;
    }

    public void setShopName(String shopName){
        this.shop = shopName;
    }

    public void setDiscount(String discount){
        this.discount = discount;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void publishedByOwner(boolean isPublishedByAnOwner){
        this.isPublishedByAnOwner = isPublishedByAnOwner;
    }

    public String getShopName(){
        return shop;
    }

    public String getDiscount(){
        return discount;
    }

    public String getContent(){
        return content;
    }

    public int getDuration(){
        return duration;
    }

    public boolean isPublishedByAnOwner(){
        return isPublishedByAnOwner;
    }

    public boolean isComplete(){
        if (shop.length()>0 && discount.length()>0){
            return true;
        }
        return false;
    }
}