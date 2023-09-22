
   /*Define an interface Bank with methods deposit() and withdraw().
 Create classes SavingsAccount and CurrentAccount that implement the Bank interface.
  Override the methods to perform account-specific actions.*/
   import java.util.*;
   interface Bank{
    void deposit();
    void withdraw();
    void display();
}
class SavingsAcc implements Bank{
       Scanner sc=new Scanner(System.in);
    int amount=0;
    int currentbalance;
    public void deposit(){
        System.out.print("enter the amount to deposit \t");
        amount=sc.nextInt();
        currentbalance=currentbalance+amount;
        System.out.println("Amount deposit:"+ amount);
        System.out.println("total balance:"+ currentbalance);
        }
        public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to withdraw");
        amount=sc.nextInt();
        currentbalance=currentbalance-amount;
        System.out.println("Amount depost :"+ amount);
        System.out.println("total balance :"+ currentbalance);
    }
         public void display(){
            System.out.println("current balance"+currentbalance);
        }
    }
class CurrentAccount implements Bank { 
     Scanner sc=new Scanner(System.in);
      int amount=0;
    int currentbalance;
    public void deposit(){
        System.out.println("enter the amount to deposit");
        amount=sc.nextInt();
        currentbalance=currentbalance+amount;
        System.out.println("Amount depost:"+ amount);
        System.out.println("total balance:"+ currentbalance);
    }
        public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to deposit");
        amount=sc.nextInt();
        currentbalance=currentbalance-amount;
        System.out.println("Amount depost:"+ amount);
        System.out.println("total balance :"+ currentbalance);
    }
         public void display(){
            System.out.println("current balance :"+currentbalance);
        }
}

class bankdemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SavingsAcc s1=new SavingsAcc();
        CurrentAccount c1=new CurrentAccount();
 Scanner sc1 = new Scanner(System.in);
        while(true){
            System.out.println(" ***********Banking system**************");
            System.out.println("Choose"+"\n (1) for saving account"+"\n (2) for checking account");
            int inputa = sc.nextInt();
            switch (inputa) {
                case 1: System.out.println("******************saving account******************");
                        System.out.println("Choose"+"\n (1) for deposit"+"\n (2) for withdrawn"+"\n (3) for check balance"+"\n (4) for exit");
                        int inputcheck = sc.nextInt();
                        switch (inputcheck) {
                            case 1: s1.deposit();
                                break;
                            case 2: s1.withdraw();
                                break;
                            case 3: s1.display();
                                break;        
                            case 4: System.exit(4);
                            default:
                                break;
                        }
                    
                    break;
                case 2: System.out.println("**************Current account*******************");
                        System.out.println("Choose"+"\n (1) for deposit"+"\n (2) for withdrawn"+"\n (3) for check balance"+"\n (0) for exit");
                        int inputCh2 = sc.nextInt();
                        switch (inputCh2) {
                            case 1: c1.deposit();
                                break;
                            case 2: c1.withdraw();
                                break;
                            case 3: c1.display();
                                break;    
                            case 4: System.exit(4);
                            default:
                                break;
                        }
                    
                    break;    
            
                default:
                    break;
            }

        }
    }
}
