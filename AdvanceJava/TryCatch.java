class MyCustomException extends Exception{
  public MyCustomException(String string){
    super(string);

  }

}

public class TryCatch {
  public static void main(String[] args) {
    int i=20;
    int j=0;
    int arr[]=new int[5];
    String str=null;
    
    try{
      j=18/i;
      if(j==0) throw new MyCustomException("i dont want expception");
      int length=str.length();
      System.out.println(arr[0]);
      System.out.println(arr[4]);
    }catch(MyCustomException e){
      j=18/1;
      System.out.println("thats the default output");

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
