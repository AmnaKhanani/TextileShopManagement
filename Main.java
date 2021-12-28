
package textile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import java.awt.Font;


public class Main  {
        
    
   
    public static void main(String[]args){
        JFrame jf = new JFrame("INVOICE");
        
        Goldinvoice invgold = new Goldinvoice();
        invgold.customer = new GoldCustomer(55,"Ali","0300-3269872",45);
        invgold.product = new Product(83,"Pents","Kids Pents",200.0,50);
        invgold.date = new Date();
        invgold.invoiceNo = 1;
        List<lineItem> items =new ArrayList<>();
        items.add(new lineItem(1, 10, 31, 100));
        invgold.items = items;
        double g = invgold.customer.issueDiscount(items.get(0).amount);
        String a = invgold.setcreditCardNo("548-985");
        
        JLabel lb = new JLabel();
        lb.setText("INVOICE OF GOLD CUSTOMER");
        lb.setBounds(10, 10, 550, 100);
        lb.setFont(new Font("Verdana", Font.PLAIN, 18));
        jf.add(lb);
        
        JLabel lb0 = new JLabel();
        lb0.setText("----------------------------------------------------------------");
        lb0.setBounds(10, 20, 550, 120);
        jf.add(lb0);
        
        JLabel lb01 = new JLabel();
        lb01.setText("Invoice No:     "+ invgold.invoiceNo);
        lb01.setBounds(10,30,400,140);
        jf.add(lb01);
        
        JLabel lb02 = new JLabel();
        lb02.setText("Date/Day/Time:     "+ invgold.date);
        lb02.setBounds(10,40,400,160);
        jf.add(lb02);
        
        JLabel lb03 = new JLabel();
        lb03.setText("----------------------------------------------------------------");
        lb03.setBounds(10, 50, 550, 180);
        jf.add(lb03);
        
        
        JLabel lb1 = new JLabel();
        lb1.setText("Customer Name:     "+ invgold.customer.Name);
        lb1.setBounds(10,60,400,200);
        jf.add(lb1);
        
        JLabel lb2 = new JLabel();
        lb2.setText("Customer Id:    "+invgold.customer.Id);
        lb2.setBounds(10,60,400,240);
        jf.add(lb2);
        
        
        JLabel lb4 = new JLabel();
        lb4.setText("Product Name:     "+ invgold.product.Name);
        lb4.setBounds(10,90,400,260);
        jf.add(lb4);
        
        JLabel lb5 = new JLabel();
        lb5.setText("Product ID:     "+ invgold.product.Id);
        lb5.setBounds(10,100,400,280);
        jf.add(lb5);
        
        for(lineItem i: items){
            
        
        JLabel lb6 = new JLabel();
        lb6.setText("Product Quantity:     "+ i.quantity);
        lb6.setBounds(10,110,400,300);
        jf.add(lb6);
        
        JLabel lb7 = new JLabel();
        lb7.setText("Product Price:     "+ i.price);
        lb7.setBounds(10,120,400,320);
        jf.add(lb7);
        
        JLabel lb8 = new JLabel();
        lb8.setText("Product Amount:     "+i.amount);
        lb8.setBounds(10,130,400,340);
        jf.add(lb8);
        
        JLabel lb08 = new JLabel();
        lb08.setText("Discount:     "+g);
        lb08.setBounds(10,140,400,360);
        jf.add(lb08);
       
        
        JLabel lb9 = new JLabel();
        lb9.setText("-----------------------------------------------------------------");
        lb9.setBounds(10,150,400,380);
        jf.add(lb9);
        
        JLabel lb10 = new JLabel();
        lb10.setText("-----------------------------------------------------------------");
        lb10.setBounds(10,160,400,400);
        jf.add(lb10);
        }
        
        jf.setSize(350,450);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        
        JFrame jf1 = new JFrame("INVOICE");
        
        Silverinvoice invsilver = new Silverinvoice();
        invsilver.customer = new SilverCustomer(98,"Ahmed","0323-55952493",29);
        invsilver.product = new Product (45,"Shirts", "Kids Shirts",120.0,90);
        invsilver.date = new Date();
        invsilver.invoiceNo = 2;
        List<lineItem> items1 =new ArrayList<>();
        items1.add(new lineItem(5, 6, 91, 160));
        invsilver.items = items1;
        double s = invsilver.customer.issueDiscount(items1.get(0).amount);
        
        
        JLabel lba = new JLabel();
        lba.setText("INVOICE OF SILVER CUSTOMER");
        lba.setBounds(10, 10, 550, 100);
        lba.setFont(new Font("Verdana", Font.PLAIN, 18));
        jf1.add(lba);
        
        JLabel lbb = new JLabel();
        lbb.setText("----------------------------------------------------------------");
        lbb.setBounds(10, 20, 550, 120);
        jf1.add(lbb);
        
        JLabel lbc = new JLabel();
        lbc.setText("Invoice No:     "+ invsilver.invoiceNo);
        lbc.setBounds(10,30,400,140);
        jf1.add(lbc);
        
        JLabel lbd = new JLabel();
        lbd.setText("Date/Day/Time:     "+ invsilver.date);
        lbd.setBounds(10,40,400,160);
        jf1.add(lbd);
        
        JLabel lbe = new JLabel();
        lbe.setText("----------------------------------------------------------------");
        lbe.setBounds(10, 50, 550, 180);
        jf1.add(lbe);
        
        
        JLabel lbf = new JLabel();
        lbf.setText("Customer Name:     "+ invsilver.customer.Name);
        lbf.setBounds(10,60,400,200);
        jf1.add(lbf);
        
        JLabel lbo = new JLabel();
        lbo.setText("Customer Id:    "+invsilver.customer.Id);
        lbo.setBounds(10,60,400,240);
        jf1.add(lbo);
        
        JLabel lbg = new JLabel();
        lbg.setText("Product Name:     "+ invsilver.product.Name);
        lbg.setBounds(10,90,400,260);
        jf1.add(lbg);
        
        JLabel lbh = new JLabel();
        lbh.setText("Product ID:     "+ invsilver.product.Id);
        lbh.setBounds(10,100,400,280);
        jf1.add(lbh);
        
        for(lineItem i: items1){
            
        
        JLabel lbi = new JLabel();
        lbi.setText("Product Quantity:     "+ i.quantity);
        lbi.setBounds(10,110,400,300);
        jf1.add(lbi);
        
        JLabel lbj = new JLabel();
        lbj.setText("Product Price:     "+ i.price);
        lbj.setBounds(10,120,400,320);
        jf1.add(lbj);
        
        JLabel lbk = new JLabel();
        lbk.setText("Product Amount:     "+i.amount);
        lbk.setBounds(10,130,400,340);
        jf1.add(lbk);
        
        JLabel lbl = new JLabel();
        lbl.setText("Discount:     "+s);
        lbl.setBounds(10,140,400,360);
        jf1.add(lbl);
        
        JLabel lbm = new JLabel();
        lbm.setText("-----------------------------------------------------------------");
        lbm.setBounds(10,150,400,380);
        jf1.add(lbm);
        
        JLabel lbn = new JLabel();
        lbn.setText("-----------------------------------------------------------------");
        lbn.setBounds(10,160,400,400);
        jf1.add(lbn);
        }
        
        jf1.setSize(350,450);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setVisible(true);
        
        
        
        JFrame jf2 = new JFrame("INVOICE");
        
        Platinuminvoice invplatinum = new Platinuminvoice();
        invplatinum.customer = new PlatinumCustomer(33,"Sara","0300-297462386",32); 
        invplatinum.product = new Product (31,"T-Shirts","Men T-Shirts",100.0,150);
        invplatinum.date = new Date();
        invplatinum.invoiceNo = 3;
        List<lineItem> items2 =new ArrayList<>();
        items2.add(new lineItem(5, 6, 91, 160));
        invplatinum.items = items2;
        double p = invplatinum.customer.issueDiscount(items2.get(0).amount);
        
        
        JLabel lb11 = new JLabel();
        lb11.setText("INVOICE OF PLATINUM CUSTOMER");
        lb11.setBounds(10, 10, 550, 100);
        lb11.setFont(new Font("Verdana", Font.PLAIN, 18));
        jf2.add(lb11);
        
        JLabel lb22 = new JLabel();
        lb22.setText("----------------------------------------------------------------");
        lb22.setBounds(10, 20, 550, 120);
        jf2.add(lb22);
        
        JLabel lb33 = new JLabel();
        lb33.setText("Invoice No:     "+ invplatinum.invoiceNo);
        lb33.setBounds(10,30,400,140);
        jf2.add(lb33);
        
        JLabel lb44 = new JLabel();
        lb44.setText("Date/Day/Time:     "+ invplatinum.date);
        lb44.setBounds(10,40,400,160);
        jf2.add(lb44);
        
        JLabel lb55 = new JLabel();
        lb55.setText("----------------------------------------------------------------");
        lb55.setBounds(10, 50, 550, 180);
        jf2.add(lb55);
        
        
        JLabel lb66 = new JLabel();
        lb66.setText("Customer Name:     "+ invplatinum.customer.Name);
        lb66.setBounds(10,60,400,200);
        jf2.add(lb66);
        
        JLabel lbp = new JLabel();
        lbp.setText("Customer Id:    "+invplatinum.customer.Id);
        lbp.setBounds(10,60,400,240);
        jf2.add(lbp);
        
        
        JLabel lb77 = new JLabel();
        lb77.setText("Product Name:     "+ invplatinum.product.Name);
        lb77.setBounds(10,90,400,260);
        jf2.add(lb77);
        
        JLabel lb88 = new JLabel();
        lb88.setText("Product ID:     "+ invplatinum.product.Id);
        lb88.setBounds(10,100,400,280);
        jf2.add(lb88);
        
        for(lineItem i: items2){
            
        
        JLabel lb99 = new JLabel();
        lb99.setText("Product Quantity:     "+ i.quantity);
        lb99.setBounds(10,110,400,300);
        jf2.add(lb99);
        
        JLabel lb00 = new JLabel();
        lb00.setText("Product Price:     "+ i.price);
        lb00.setBounds(10,120,400,320);
        jf2.add(lb00);
        
        JLabel lb34 = new JLabel();
        lb34.setText("Product Amount:     "+i.amount);
        lb34.setBounds(10,130,400,340);
        jf2.add(lb34);
        
        JLabel lb35 = new JLabel();
        lb35.setText("Discount:     "+p);
        lb35.setBounds(10,140,400,360);
        jf2.add(lb35);
        
        JLabel lb36 = new JLabel();
        lb36.setText("-----------------------------------------------------------------");
        lb36.setBounds(10,150,400,380);
        jf2.add(lb36);
        
        JLabel lb37 = new JLabel();
        lb37.setText("-----------------------------------------------------------------");
        lb37.setBounds(10,160,400,400);
        jf2.add(lb37);
        }
        
        jf2.setSize(350,450);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf2.setVisible(true);
        
        
        
        ICustomer customer1 = new GoldCustomer(55,"Ali","0300-3269872",45);
        ICustomer customer2 = new SilverCustomer(98,"Ahmed","0323-55952493",29);
        ICustomer customer3 = new PlatinumCustomer(33,"Sara","0300-297462386",32); 
        
        
        Product product1 = new Product (31,"T-Shirts","Men T-Shirts",100.0,150);
        Product product2 = new Product (45,"Shirts", "Kids Shirts",120.0,90);
        Product product3 = new Product (83,"Pents","Kids Pents",200.0,50);
        Product  product4= new Product (901,"Pents","Men Pents",180.0,100);
        product1.print();
        System.out.println("\n\n");
        product2.print();
        System.out.println("\n\n");
        product3.print();
        System.out.println("\n\n");
        product4.print();
        
        
        
        
    }
}


