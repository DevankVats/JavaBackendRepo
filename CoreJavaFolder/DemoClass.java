class Calculator{
  int a;
  public int add(int n1,int n2){
    int r=n1+n2;
    return r;
  }
  public static void printVal(){
    System.out.println("we can call it without creating object");
  }
 
}

 
public class DemoClass {
  
  public static void main(String[] args){
    int num1=8;
    int num2=9;
    
    Calculator c=new Calculator();
    int result=c.add(num1,num2);
    System.out.println("The sum of number is: "+result);
    c.printVal();

  }
  
}
