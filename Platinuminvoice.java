
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//platinum invoice class created for gold customer information
public class Platinuminvoice {
    int invoiceNo;
    Date date;
    double amount;
    //aggregation of platinum customer class
    PlatinumCustomer customer;
    //aggregation of product class
    Product product;
    //encapsulation
    private String creditCardNo;
    List<lineItem> items;
 

    Platinuminvoice() {
    
        this.items = new ArrayList<>();       

    
}
    //getters and setters method for accessing private variable
    public String getcreditCardNo(){
        return creditCardNo;
 
    }

    public String setcreditCardNo(String c){
        creditCardNo = c;
        return c;
    }
    
}
