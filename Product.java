
package textile;
import java.io.*;
   
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
       try{
           FileOutputStream fos = new FileOutputStream("project.txt");
           DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Product ID: "+ Integer.toString(Id));
            dos.writeUTF("\nProduct Name: "+Name);
            dos.writeUTF("\nProduct Category: "+Category);
            dos.writeUTF("\nProduct Price: $"+ Double.toString(Price));
            dos.writeUTF("\nProduct Stock: "+ Integer.toString(Stock)+"pcs");
            
            fos.close(); dos.close();   
       }
       
       catch(IOException e){
           e.getStackTrace();
       }
       
       
       
       System.out.println("Product ID: "+ Integer.toString(Id));
       System.out.println("Product Name: "+Name);
       System.out.println("Product Category: "+Category);
       System.out.println("Product Price: $"+ Double.toString(Price));
       System.out.println("Product Stock: "+ Integer.toString(Stock)+"pcs");
       
       
   }
    
} 

