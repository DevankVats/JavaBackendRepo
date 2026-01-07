interface A{
  int age=20;
  String city="Shamli";

  void show();
  void config();
}
interface C{
void profession();
}

class B implements A,C{
  public void show(){
    System.out.println("Inside show");
  }
  public void config(){
    System.out.println("Inside config");
  }
  public void profession(){
    System.out.println("He is a student");
  }
}





public class InterfaceClass {
  public static void main(String[] args) {
    B obj=new B();
    obj.show();
    obj.config();
    System.out.println("Name: Devank, "+"age: "+A.age+" ,City: "+A.city);
    obj.profession();
    
  }
  
}
