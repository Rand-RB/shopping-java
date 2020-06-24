
public class OnlineShopping extends ShoppingStore {
    //declear variables
   private String website_name;
   
   public OnlineShopping(String store_name,int store_id,String owner_name,String Working_hours,String website_name){
    super(store_name,store_id,owner_name,Working_hours);
    this.website_name=website_name;
   }
   
   
   @Override
   public String toString(){
   return super.toString()+"\nWebsite_Name"+website_name+"\n\n";
   }
    
    
    
    
    
    
    
    
    
    
    
}
