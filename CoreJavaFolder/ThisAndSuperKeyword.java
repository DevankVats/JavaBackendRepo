class A{
  public A(){
    System.out.println("Inside A");
  }
  public A(int n){
    System.out.println("Inside A int");
  }

}
class B extends A{
  public B(){
    System.out.println("Inside B");
  }
  public B(int n){
    super(n);
    //this();
    System.out.println("Inside B int");
  }
}




public class ThisAndSuperKeyword {
  public static void main(String[] args){
    B obj=new B(5);

  }
  
}
