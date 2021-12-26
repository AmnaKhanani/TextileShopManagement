
package textile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[]args){
        
        invoice inv = new invoice();
        inv.customer = new GoldCustomer(55,"Ali","0300-3269872",45);
        inv.date = new Date();
        inv.invoiceNo = 1;
        List<lineItem> items =new ArrayList<>();
        items.add(new lineItem(1, 10, 31, 100));
        inv.items = items;
        System.out.println((items));
        
        ICustomer customer1 = new GoldCustomer(55,"Ali","0300-3269872",45);
        ICustomer customer2 = new SilverCustomer(98,"Ahmed","0323-55952493",29);
        ICustomer customer3 = new PlatinumCustomer(33,"Sara","0300-297462386",32); 
        
        
        Product product1 = new Product (31,"T-Shirts","Men T-Shirts",100.0,150);
        //System.out.println(product1.Id);
        Product product2 = new Product (45,"Shirts", "Kids Shirts",120.0,90);
        Product product3 = new Product (83,"Pents","Kids Pents",200.0,50);
        Product  product4= new Product (901,"Pents","Men Pents",180.0,100);
        //product1.print();
        //product2.print();
        //product3.print();
       // product4.print();
        
        
        
        
    }
}


