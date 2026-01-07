public class TryCatch {
  public static void main(String[] args) {
    int i=9;
    int j=0;
    
    try{
      j=18/i;
    }catch(Exception e){
      System.out.println("Something Wrong Happened...");
    }
    System.out.println(j);
    System.out.println("Program executed successfully...");
  }
}
