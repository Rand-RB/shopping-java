
public class OnsiteShopping extends ShoppingStore {
    //declear variable 
    private String location;
    
    public OnsiteShopping(String store_name,int store_id,String owner_name,String Working_hours,String location){
    super(store_name,store_id,owner_name,Working_hours);    
    this.location=location;
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"\nLocation:"+location+"\n\n";
    }
}
