

class A{
  public void show(){
    System.out.println("inside A show");
  }
}


public class AnonyInner {
  public static void main(String[] args) {
    A obj=new A(){
      public void show(){
        System.out.println("Inside new show");
      }
    };
    obj.show();
    
  }
  
}
