 class CalculateSum{
  public int add(int n1,int n2){
    return n1+n2;
  }
  public int add(int n1,int n2,int n3){
    return n1+n2+n3;
  }
  public double add(double a,double b){
    return a+b;
  }

}

// Method Overloading=>same method name,but different signatures(either parameters and return type or parameters)
public class MethodOverloading {
  public static void main(String[] args){
    CalculateSum c=new CalculateSum();
    int r1=c.add(2,3);
    int r2=c.add(2,3,4);
    double r3=c.add(2.4,5.6);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);



  }
}
