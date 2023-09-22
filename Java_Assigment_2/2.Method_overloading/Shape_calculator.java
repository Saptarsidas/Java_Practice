package  Method_overloading;
import java.util.*;;

public class Shape_calculator {
    void  area(int a,int b){
        System.out.println("area of reqtangel is "+a*b);
    }
    void area(int r){
        System.out.println("area of circle is "+3.14*(r*r));
    }
    void area(int a,int b,int c){
        double s=(a+b+c)/2;
        double x=Math.sqrt(s*((a-b)*(a-b)*(a-c)));
        System.out.println("Area of triangle is" + s );
      }
    public static void main(String[] args) {
        Shape_calculator c1=new Shape_calculator();
        c1.area(3,4);
        c1.area(20);
        c1.area(4,5,6);
        
    }
    
}
