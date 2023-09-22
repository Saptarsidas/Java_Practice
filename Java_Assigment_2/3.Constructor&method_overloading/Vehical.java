/*Design a class Vehicle with attributes make, model,
 year, and price. Provide constructors to initializ
e objects using different combinations of attributes.
 Overload a method to display vehicle details
, including its make, model, and year.*/
class  Vehicle{
     String make;
     int year;
     double price;
    String model ;
    Vehicle(){
    this.make="BULLET";
    this.year=2008;
    this.price=1.4500000;
    this.model="ROYAL_ENFIELD";
}
Vehicle( String make,int year,double price, String model ){
    this.make=make;
    this.year=year;
    this.price=price;
    this.model=model;
}
void display(){
    System.out.println(this.make);
    System.out.println(this.model);
    System.out.println(this.year);
    System.out.println("Price: "+String.format("%,.3f",this.price));
}
public static void main(String[] args) {
    Vehicle v1=new Vehicle();
    Vehicle v2=new Vehicle("HONDA", 2012, 1.1000000, "SPLENDER");
    v1.display();
    v2.display();
}
}