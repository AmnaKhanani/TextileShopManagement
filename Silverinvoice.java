
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Silverinvoice {
    int invoiceNo;
    Date date;
    double amount;
    SilverCustomer customer;
    Product product;
 
    List<lineItem> items;
 

 Silverinvoice() {
    
     this.items = new ArrayList<>();       

    
}}
