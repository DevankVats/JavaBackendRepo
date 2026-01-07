class Smartphone{
  String brand;
  int price;
  static String name;

  void show(){
    System.out.println(brand+" : "+price+" => "+name);
  }

  static void run(){
    System.out.println("Someone is calling");
  }
}


public class StaticVaraible {
  public static void main(String[] args){
    Smartphone s1=new Smartphone();
    s1.brand="Samsung";
    s1.price=15000;
    Smartphone.name="smartphone";

    Smartphone s2=new Smartphone();
    s2.brand="Redmi";
    s2.price=12000;
    

    s1.show();
    s2.show();
    Smartphone.run();
  }
  
}
