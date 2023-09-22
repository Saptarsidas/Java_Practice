 /*Develop an interface Language with a method greet().
  Implement classes English, French, and Spanish that implement the Language interface.
  Override the greet() method to provide greetings in different languages.*/
  interface Language{
    void greet();
  }
  class English implements Language{
    public void greet(){
        System.out.println( "IN_ENGLISH-Hello");
    }
}
  class French implements Language{
    public void greet(){
        System.out.println( "IN_French-Bonjour");
    }
  }
  class Spanish implements Language{
    public void greet(){
        System.out.println( "IN_SPANISH -Hola");
    }
  }
  class languages{
    public static void main(String[] args){
        English e = new English();
        e.greet();
        French f = new French();
        f.greet();
        Spanish s = new Spanish();
        s.greet();
    }
  }