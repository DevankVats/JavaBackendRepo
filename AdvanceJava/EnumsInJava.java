enum Status{
  Load,Failed,Succeed;
}




public class EnumsInJava{
  public static void main(String[] args) {
    Status s[]=Status.values();
    for(Status elem:s){
      System.out.println(elem+" : "+elem.ordinal());
    }
  }

}