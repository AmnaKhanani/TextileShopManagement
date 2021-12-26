
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class invoice{
    int invoiceNo;
    Date date;
    double amount;
    ICustomer customer;
    List<lineItem> items = new ArrayList<>();
    
}