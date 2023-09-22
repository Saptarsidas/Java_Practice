 /*Define an interface Animal with a method makeSound().
Create classes Dog and Cat that implement the Animal interface.
Override the makeSound() method to make appropriate sounds for each animal.*/
interface Animal{
   void makesound();
}
class Dog implements Animal{
    public void makesound(){ 
    System.out.println("Dog barking");
    }
}

class Cat implements Animal{
    public void makesound(){ 
        System.out.println("Cat meowing");
    }
}
class Animals{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.makesound();
        c.makesound();
    }
        
}
