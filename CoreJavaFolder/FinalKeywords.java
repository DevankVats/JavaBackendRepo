class A{
  public  void show(){
    System.out.println("Inside A");
  }
  public void add(int a,int b){
    System.out.println(a+b);
  }
}
class B extends A{
  public void show(){
    System.out.println("Inside B");
  }

}

public class FinalKeywords {
  public static void main(String[] str){
    final Double PIE=3.14;
    //PIE=3.144;
    System.out.println(PIE);
    B obj=new B();
    obj.show();

  }
  
}
