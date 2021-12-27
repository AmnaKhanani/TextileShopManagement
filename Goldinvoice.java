
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class Goldinvoice{
    int invoiceNo;
    Date date;
    double amount;
    GoldCustomer customer;
    Product product;
    private String creditCardNo;
    
    
    List<lineItem> items;
    

    Goldinvoice() {
       
        this.items = new ArrayList<>();        
}
   public String getcreditCardNo(){
       return creditCardNo;
    
    
}
  public String setcreditCardNo(String c){
      creditCardNo = c;
      return "";
  }
  
    
}
