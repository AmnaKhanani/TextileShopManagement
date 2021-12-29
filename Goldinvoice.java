
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//gold invoice class created for gold customer information
class Goldinvoice{
    int invoiceNo;
    Date date;
    double amount;
    //aggregation of gold customer class
    GoldCustomer customer;
    //aggregation of product class
    Product product;
    //encapsulation
    private String creditCardNo;
    
    
    List<lineItem> items;
    

    Goldinvoice() {
       
        this.items = new ArrayList<>();        
}  //getters and setters method for accessing private variable
   public String getcreditCardNo(){
       return creditCardNo;
    
    
}
  public String setcreditCardNo(String c){
      creditCardNo = c;
      return c;
  }
  
    
}
