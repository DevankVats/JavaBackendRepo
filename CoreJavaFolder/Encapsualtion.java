class Human{
  private String name;
  private int age;

  public Human(){
    age=18;
    name="John";
  }
  public Human(String name){
    this.name=name;
    age=18;
  }

  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setName(String name){
    this.name=name;

  }
}
public class Encapsualtion {
  public static void main(String[] args){
    Human h1=new Human();
    h1.setAge(21);
    h1.setName("Devank");
    System.out.println("Name: "+h1.getName()+" , Age: "+h1.getAge());
  }
  
}
