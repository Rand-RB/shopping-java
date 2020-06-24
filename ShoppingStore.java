
public class ShoppingStore {
    //declear variables
   private String store_name;
   private int store_id;
   private String owner_name;
   private String Working_hours;
   //constructor
   public ShoppingStore(String store_name,int store_id,String owner_name,String Working_hours){
       this.store_name= store_name;
       this.store_id=store_id;
       this.owner_name=owner_name;
       this.Working_hours=Working_hours;
   }
   
   
   //get store name 
   public String get_store_Name(){
       return store_name;
   }
   
   
   //get store ID
   public int get_store_ID(){
   return store_id;
   } 
   
   //get name 
   public String get_owner_name(){
       return owner_name;
   }
   
   //get working houres
   public String get_Working_hours(){
   return Working_hours;
   }
   
   //toString methode
   @Override
   public String toString(){
return "Store shop Details:\nStore Name:"+get_store_Name()+"\nStore ID:"+get_store_ID()
        + "\nOwner Name:" + get_owner_name()+ "\nWorkingHoures:"+get_Working_hours();
   }
   
   
   
   
   
   
   
   
   
}
   
