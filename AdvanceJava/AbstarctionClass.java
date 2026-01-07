//package AdvanceJava;
abstract class Car{
  public void playMusic(){
    System.out.println("Music is playing...");
  }
  public abstract void drive();
  public abstract void speedup();
}
class WagnoR extends Car{
  public void drive(){
    System.out.println("Car is driving...");
  }
  public void speedup(){
    System.out.println("Turbo mode on...");

  }
}

public class AbstarctionClass {
  public static void main(String[] args){
    Car obj=new WagnoR();
    obj.drive();
    obj.playMusic();
    obj.speedup();


  }
  
}
