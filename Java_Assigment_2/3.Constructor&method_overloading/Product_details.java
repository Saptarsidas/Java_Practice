/*Create a class Product with attributes productId, productName, price, and quantity.
 Implement constructors to initialize the product objects using different sets of attributes.
  Overload a method to calculate the total cost (price * quantity) of a product.*/
  class Product_details{
    int product_id;
    String product_name;
    int price;
    double quantity;
 Product_details(){
    this.product_id = 0;
    this.product_name = " SOYASOS";
    this.price = 10;
this.quantity =450.2;
}
 Product_details(int product_id,String product_name, int price,double quantity){
         this.product_id = product_id;
         this.product_name = product_name;
         this.price=price;
         this.quantity=quantity;

 }
 void display(int x){
   System.out.println("Total cost"+ (price*quantity));
 }
  void display(double y){
   System.out.println("Total cost"+ (price*quantity));
 }

 public static void main(String[] args) {
    Product_details p1 = new Product_details();
    Product_details p2 = new Product_details(1,"ONIONS",20,200);
    p1.display(5);
    p2.display(5.2);
 }
}