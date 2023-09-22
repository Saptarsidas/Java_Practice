public class Calculator{
    void add(int a,int b ){
System.out.println(a+b);
    }
void add(long a,double b){
    System.out.println(a+b);
}
void add(int a,long b){
    System.out.println(a+b);
}
public static void main(String[] args) {
    Calculator c=new Calculator();
    c.add(5, 15);
    c.add(200, 500);
    c.add(1, 7);
}
}