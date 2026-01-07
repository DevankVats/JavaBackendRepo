class A{
  public void show(){
    System.out.println("Inside A show");
  }
}
class B extends A{
  public void show1(){
    System.out.println("Inside B show");
  }
}

public class UCDC {
  public static void main(String[] str){
    A obj=(A)new B();
    obj.show();
  }
  
}
