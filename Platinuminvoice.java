
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Platinuminvoice {
    int invoiceNo;
    Date date;
    double amount;
    PlatinumCustomer customer;
    Product product;
    private String creditCardNo;
    List<lineItem> items;
 

    Platinuminvoice() {
    
        this.items = new ArrayList<>();       

    
}
    public String getcreditCardNo(){
        return creditCardNo;
 
    }

    public String setcreditCardNo(String c){
        creditCardNo = c;
        return c;
    }
    
}
