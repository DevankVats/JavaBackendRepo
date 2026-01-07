
class A{
  int age;
  public static void  show(){
    System.out.println("Inside A class Method show..");
  }
  class B{
    void config(){
      System.out.println("Inside config of B..");
    }

  }
}





public class InnerClass {
  public static void main(String[] args) {
    A obj=new A();
    A.show();
    A.B obj1=obj.new B();
    obj1.config();
    
  }
  
}
