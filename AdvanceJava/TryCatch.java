public class TryCatch {
  public static void main(String[] args) {
    int i=9;
    int j=0;
    int arr[]=new int[5];
    String str=null;
    
    try{
      j=18/i;
      int length=str.length();
      System.out.println(arr[0]);
      System.out.println(arr[5]);
    }catch(ArithmeticException e){
      System.out.println("you are dividing integer by zero"+e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("stay in your limits... "+e);
    }catch(Exception e){
      System.out.println("something went wrong");
    }
    System.out.println(j);
    System.out.println("Program executed successfully...");
  }
}
