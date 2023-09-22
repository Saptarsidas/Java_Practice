 /*Design an interface CurrencyConverter with a method convertCurrency(). 
 Implement classes DollarConverter and EuroConverter that implement the CurrencyConverter interface.
  Override the method to perform currency conversion.*/
  
  import java.util.*;
  interface CurrencyConverter{
    void convertCurrency();
  }
  class DollarConverter implements CurrencyConverter{
    Scanner sc =new Scanner(System.in);
    double amt=0;
    public void convertCurrency(){
        System.out.println("Enter the  indian amount ");
        amt=sc.nextDouble();
        System.out.println(" After converting  usd amt is :"+(amt/83.14));
}
  }
class EuroConverter implements CurrencyConverter{
    Scanner sc =new Scanner(System.in);
    double amt=0;
    public  void convertCurrency(){
        System.out.println("Enter the  indian amount to be converted");
        amt=sc.nextDouble();
        System.out.println("Indian to Euro currency convertor :"+(amt/88.14));
    }
}
class Currency
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                DollarConverter d=new DollarConverter();
                    EuroConverter e=new EuroConverter();
                        Scanner sc1=new Scanner(System.in);
                        while (true){
                            System.out.println("Curency converters");
                            System.out.println("Choose"+"\n (1) USD CONVERTOR"+"\n (2) EURO CONVERTOR");
                            System.out.println("Enter your choice");
                            int ch=sc.nextInt();
                            switch(ch){
                                case 1:
                                    d.convertCurrency();
                                    break;
                             case 2:
                             e.convertCurrency();       
                                    break;
             }
                            
        }
    }
}

      