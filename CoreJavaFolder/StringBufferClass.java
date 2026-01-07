public class StringBufferClass {
  public static void main(String[] args){
    StringBuffer s=new StringBuffer("Devank");
    System.out.println(s);
    s.append(" Vats");
    System.out.println(s);
    s.insert(6," kumar ");
    System.out.println(s);
    s.delete(6, 12);
    System.out.println(s);

    

  }
  
}
