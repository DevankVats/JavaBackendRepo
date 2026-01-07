enum Status{
Load,Running,Failed,Succeed;
}



public class SwitchEnum {
  public static void main(String[] args) {
    Status s=Status.Succeed;
    

    //if-else
    // if(s==Status.Running){
    //   System.out.println("process is executing");
    // }else if(s==Status.Failed){
    //   System.out.println("Try Again");
    // }else if(s==Status.Load){
    //   System.out.println("Please Wait");
    // }else{
    //   System.out.println("Successfully completed");
    // }

    //switch 
    switch(s){
      case Running: 
                    System.out.println( "process is executing");
                    break;
      case Failed: 
                    System.out.println( "Try Again");
                    break;
      case Load: 
                    System.out.println( "please wait");
                    break;
      default: 
                    System.out.println( "completed successfully");
                    break;

     

    }


  }
}
