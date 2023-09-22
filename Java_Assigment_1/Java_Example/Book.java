class Book {
    String Bname,Authorname;
    double price;
    int page;
    Book(){
        this.Bname="Java programming";
        this.Authorname="Prof.Ratul";
        this.price=568;
        this.page=560;
    }
    Book(String n,String a,double i,int p1){
        this.Bname=n;
        this.Authorname=a;
        this.price=i;
        this.page=p1;
    }
    void display(){
        System.out.println("Book name is:"+Bname);
        System.out.println("Book's Author  name is:"+Authorname);
        System.out.println("Book's price  is:"+price);
        System.out.println("page no is "+page);
    }
    public static void main(String[]args){
     Book b1=new Book("Java programming","Prof.Ratul",568,560);
     Book b2=new Book("Operating system","Snigdha",680,750);
            b1.display();
            b2.display();
    }
    
}