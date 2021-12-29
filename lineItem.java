
package textile;
//lineitem class for invoice details
class lineItem{
    int serialNo, quantity, productId;
    double price, amount;
    public lineItem(int serialNo, int quantity, int productId, double price){
        this.serialNo = serialNo;
        this.quantity = quantity;
        this.productId = productId;
        this.price = price;
        this.amount = this.quantity * this.price;
    }       
}