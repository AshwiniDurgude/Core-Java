public class Stu
{
 public void display(Student s)
  {
 System.out.println(s.getRollno());
 System.out.println(s.getName());
  }
 public static void main(String args[])
   {
    Stu s1=new Stu();
    Student s2= new Student();
     s2.setRollno(1);
     s2.setName("zzz");
      s1.display(s2);
 
   }

}