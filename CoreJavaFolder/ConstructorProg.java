class Human{
  private String name;
  private int age;


  //defualt constructor=> which does'nt contains any parameters
  public Human(){
    age=18;
    name="John";
  }

  //paramterized constructors
  public Human(String name){
    this.name=name;
    age=18;
  }
  public Human(String name,int age){
    this.name=name;
    this.age=age;
  }

  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
}



public class ConstructorProg {
  public static void main(String[] args){
    Human h1=new Human();
    Human h2=new Human("Sexy");
    Human h3=new Human("Devank",21);
    System.out.println("Name: "+h1.getName()+" , Age: "+h1.getAge());
    System.out.println("Name: "+h2.getName()+" , Age: "+h2.getAge());
    System.out.println("Name: "+h3.getName()+" , Age: "+h3.getAge());
    
  }
  
}
