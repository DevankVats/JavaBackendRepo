
class A{
  public void show() throws ClassNotFoundException{
    Class.forName("calc");
  }
}



public class DuckingThrows {
  public static void main(String[] args) {
    A obj=new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
    
  }
  
}
