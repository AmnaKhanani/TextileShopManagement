package textile;

interface ICustomer{
    
     double issueDiscount(double amount);
 }


class GoldCustomer implements ICustomer{
    int Id;
    String Name;
    String Contact;
    int Age;
    
    GoldCustomer(int id, String name, String contact,int age){
        this.Id=id;
        this.Name=name;
        this.Age=age;
        this.Contact=contact;
    }
    @Override
    public double issueDiscount(double amount){
        return amount*.20;
    }   
}

class SilverCustomer implements ICustomer{
    int Id;
    String Name;
    String Contact;
    int Age;
    
    SilverCustomer(int id, String name, String contact,int age){
        this.Id=id;
        this.Name=name;
        this.Age=age;
        this.Contact=contact;
    }
    @Override
    public double issueDiscount(double amount){
        return amount*.15;
    }   
}

class PlatinumCustomer implements ICustomer{
    int Id;
    String Name;
    String Contact;
    int Age;
    
    
    PlatinumCustomer(int id, String name, String contact,int age){
        this.Id=id;
        this.Name=name;
        this.Age=age;
        this.Contact=contact;
    }
    
    @Override
    public double issueDiscount(double amount){
        return amount*.10;
    }   
}

    

