public class Stud
{
 int rollno;
 String name;
public Stud(int rollno,String name)
   {
    this.rollno=rollno;
    this.name=name;
   }
public static void main(String args[])
   {
     Stud s1=new Stud(1,"Ashu");
     Stud s2=new Stud(2,"Anjali");
System.out.println("Student Rollno:"+s1.rollno);
System.out.println("Student Name:"+s1.name);
 System.out.println("Student Rollno:"+s2.rollno);
System.out.println("Student Rollno:"+s2.name);
 


   }
}
