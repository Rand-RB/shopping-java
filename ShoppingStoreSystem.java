import java.util.ArrayList;
public class ShoppingStoreSystem {

    public static void main(String[] args) {
       ShoppingStore r1= new OnlineShopping("ZARAs",13,"Hani","Webshop.com","24/7");
       ShoppingStore r2=new OnlineShopping("Tommem",14 ,"Saud","skypee.com", "24/7");
       ShoppingStore r3=new OnsiteShopping("Mangog",12,"Saleh","Red Sea Mall","MON to FRY:10AM-11PM"); 
       
       
       
       
       ArrayList<ShoppingStore>ShopingStoreList=new ArrayList<>();
       ShopingStoreList.add(r1);
       ShopingStoreList.add(r2);
       ShopingStoreList.add(r3);
       
       
       //print objects
       for (ShoppingStore T:ShopingStoreList){
           System.out.print(T);
       }
       
    }
    
}
