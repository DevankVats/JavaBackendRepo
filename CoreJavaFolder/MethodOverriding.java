class A{
  public void show(){
    System.out.println("we are inside show A");
  }
  public void config(){
    System.out.println("we are inside config");
  }
}
class B extends A{

  //overrides the parent class
  public void show(){
    System.out.println("we are inside show B");
  }

}


public class MethodOverriding {
  public static void main(String[] args){
    B b=new B();
    b.show();
    b.config();

  }
  
}
