class Employee {
    String name,eid;
    double salary;
    String designatio ; 
    Employee( ){
        this.name="Saptarsi";
        this.eid="AD";
        this.salary=150000.0;
        this.designatio="CEO";

    }
    Employee( String n,String e, Double s,String d){
        this.name=n;
        this.eid=e;
        this.salary=s;
       this.designatio=d;
    
    }
    void displayinformation(){
    System.out.println("Employee name is:"+name );
    System.out.println("Employee id is: "+eid ); 
    System.out.println("Employee salary is:"+salary );
    System.out.println("Employee desiganation is:"+designatio);
    }
    public static void main(String[] args) {
        Employee e1=new Employee("saptarsi","AD",1200000.0,"CEO");
          Employee e2=new Employee("Sumita","ADB",800000.0,"Engineer");
    e1.displayinformation();
    e2.displayinformation();

    }
}