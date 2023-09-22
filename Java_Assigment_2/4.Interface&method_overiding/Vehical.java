 /*Develop an interface Vehicle with methods start() and stop(). 
 Implement classes Car and Motorcycle that implement the Vehicle interface. 
 Override the methods to provide vehicle-specific behaviors.*/
 interface vehicle{
    void start();
    void stop();
 }
 class Car implements vehicle{
   public void start(){  
        System.out.println("Car Started");
        }
         public void stop(){
            System.out.println("Car Stopped");
        }
    }
    class Motorcycle implements vehicle{
        public void start(){
            System.out.println("Motorcycle Started");
        }
        public void stop(){
            System.out.println("Motorcycle Stopped");
        }
    } class Vehical{
    public static void main(String[] args) {
      Car c1=new Car();
      c1.start();
      c1.stop();
      Motorcycle m1=new Motorcycle();
      m1.start();
      m1.stop();     
        }
    }