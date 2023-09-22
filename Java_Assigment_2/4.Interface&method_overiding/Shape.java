/*Create an interface Shape with a method calculateArea().
 Implement classes Circle and Rectangle that implement the Shape interface.
Override the calculateArea() method in each class to compute the area of the respective shape.*/
interface Shape{
    void calarea();
}
class Circle implements Shape{
    double radius=5;
    public void calarea(){
        System.out.println( "Ariea of circle is " +radius*radius*3.14);
    }
}

class Rectangle implements Shape{
    double width=5;
    double height=5;
    public void calarea(){
        System.out.println( "Area of rectangle is " +width*height);
    }
}
class Shapee{
    public static void main(String[]args){
    Circle c=new Circle();
    Rectangle r=new Rectangle ();
    c.calarea();
    r.calarea();
}
}

