interface Computer{
  void run();
}
class Laptop implements Computer{
  public void run(){
    System.out.println("Compile,Code,Run : Faster");
  }
}
class Desktop implements Computer{
  public void run(){
    System.out.println("Compile,Code,Run");
  }

}

class Developer{
  public void devApp(Computer lap){
     lap.run();
  }
}





public class InterfaceNeed {
  public static void main(String[] args) {
    Computer desktop=new Desktop();
    Computer laptop=new Laptop();
    
    Developer devank=new Developer();
    devank.devApp(laptop);
    devank.devApp(desktop);
    
  }
}
