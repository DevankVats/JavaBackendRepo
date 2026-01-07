enum Laptop{
  Macbook(2000),Victus(1500),XPS(2200),Ideapad;

  private int price;

  private Laptop(int price){
    this.price=price;
  }
  private Laptop(){
    price=500;
  }

  public int getPrice(){
    return price;
  }
  public void setPrice(int price){
    this.price=price;
  }
}



public class EnumClass {
  public static void main(String[] args) {
    
    for(Laptop l: Laptop.values()){
      System.out.println(l+": "+l.getPrice());
    }
    
  }
}
