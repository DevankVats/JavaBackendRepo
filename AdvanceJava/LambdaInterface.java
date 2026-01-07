interface Addition{
  int addition(int a,int b);
}

public class LambdaInterface {
  public static void main(String[] args) {
    Addition add=(a,b)->a+b;

    int result=add.addition(5,7);
    System.out.println("the sum is: "+result);

    
  }
  
}
