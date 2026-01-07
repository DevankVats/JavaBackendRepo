//parent class
class Calculator{
  public int add(int a,int b){
    return a+b;
  }
  public int sub(int a,int b){
    return a-b;
  }
}

//child class
class AdvanceCalculator extends Calculator{
  public int mul(int a,int b){
    return a*b;
  }
  public int div(int a,int b){
    return a/b;
  }
}

//Multilevel inheritance
class ScientificCalc extends AdvanceCalculator{
  public double power(double a,double b){
    return Math.pow(a,b);
  }
}

public class InheritanceClass {
  public static void main(String[] args){
    //using parent class
    // Calculator obj1=new Calculator();
    // int r1=obj1.add(4,6);
    // int r2=obj1.sub(5,2);
    // System.out.println("Addition is: "+r1);
    // System.out.println("Subtraction is: "+r2);


    //using child class=> inherting properties of parent class.
    // AdvanceCalculator obj2=new AdvanceCalculator();
    // int res1=obj2.add(5,8);
    // int res2=obj2.sub(7,5);
    // int res3=obj2.mul(5,4);
    // int res4=obj2.div(100,25);
    // System.out.println("Addition is: "+res1);
    // System.out.println("Subtraction is: "+res2);
    // System.out.println("Multiplication is: "+res3);
    // System.out.println("Division is: "+res4);


    //Multilevel inheritance=> ScientificCalc class inherits properties of AdvanceCalculator and AdvanceCalcualtot
    ScientificCalc obj3=new ScientificCalc();
    int result1=obj3.add(5,8);
    int result2=obj3.sub(7,5);
    int result3=obj3.mul(5,4);
    int result4=obj3.div(100,25);
    double result5=obj3.power(7,2);
    System.out.println("Addition is: "+result1);
    System.out.println("Subtraction is: "+result2);
    System.out.println("Multiplication is: "+result3);
    System.out.println("Division is: "+result4);
    System.out.println("Power is: "+result5);

  }
  
}
