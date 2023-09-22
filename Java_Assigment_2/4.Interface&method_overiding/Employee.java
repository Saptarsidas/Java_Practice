/*Create an interface Employee with methods calculateSalary() and displayDetails(). 
Implement classes Manager and Developer that implement the Employee interface.
  Override the methods to calculate salary and display details.*/
  interface Employe{
   void calculateSalary();
    void displayDetails();
  }
  class Manager implements Employe{
    String name="Sagnik";
    int age=20;
    double salary=50000;
    public void calculateSalary(){
        System.out.println("Calculating salary" +salary);
    }
    public void displayDetails(){
        System.out.println(" Manager Displaying details");
        System.out.println( "Manager name :" + name);
        System.out.println("his age : "+ age); 
        System.out.println("his salary : "+  salary);
    
    }
}
class Developer implements Employe{
    String name="Trishita";
    int age=9;
    double salary=10;
    public void calculateSalary(){
        System.out.println("Calculating salary :" + salary);
    }
    public void displayDetails(){
        System.out.println("Devloper  displaying details");
        System.out.println( "Devloper's name :" + name);
        System.out.println( "her age :" + age);
        System.out.println("her salary : "+ salary);
    }
}
class Employee{
    public static void main(String[] args){
      Manager m1= new Manager();
      Developer dev=new Developer();
      m1.displayDetails();
      dev.displayDetails();
    }
}
