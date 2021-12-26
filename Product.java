
package textile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

   
public class Product {
   int Id;
   String Name;
   String Category;
   double Price;
   int Stock;
   
   Product (int id, String name, String category, double price, int stock){
       this.Id=id;
       this.Name=name;
       this.Category=category;
       this.Price=price;
       this.Stock=stock;
   }  
   void print(){
       System.out.println("Product ID: "+ Integer.toString(Id));
       System.out.println("Product Name: "+Name);
       System.out.println("Product Category: "+Category);
       System.out.println("Product Price: $"+ Double.toString(Price));
       System.out.println("Product Stock"+ Integer.toString(Stock)+"pcs");
       
       
   }
    
} 

