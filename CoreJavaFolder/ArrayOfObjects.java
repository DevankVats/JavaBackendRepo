class Students{
  int rollNo;
  String name;
  int marks;
}


public class ArrayOfObjects {
  public static void main(String[] args){
    Students s1=new Students();
    s1.rollNo=75;
    s1.name="Devank";
    s1.marks=78;

    Students s2=new Students();
    s2.name="Sriavastava";
    s2.rollNo=89;
    s2.marks=73;

    Students s3=new Students();
    s3.name="Gourav";
    s3.rollNo=96;
    s3.marks=70;

    Students s[]=new Students[3];
    s[0]=s1;
    s[1]=s2;
    s[2]=s3;

    for(int i=0;i<s.length;i++){
      System.out.println(s[i].name+" : "+s[i].marks);
      
    }

  }
}
