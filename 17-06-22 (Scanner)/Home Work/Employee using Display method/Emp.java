public class Emp
{
 public void display(Employee e)
  {
   System.out.println(e.getEid());
  System.out.println(e.getEname());
  System.out.println(e.getAddress());
  System.out.println(e.getEsalary());
  System.out.println(e.getComp_name());
  System.out.println(e.getGender());
  System.out.println(e.getMobno());
  System.out.println(e.getComp_add());
  System.out.println(e.getDob());
  }
 public static void main(String args[])
 {
  Emp e1=new Emp();
  Employee e2=new Employee();

  e2.setEid(102);
  e2.setEname("Arya");
  e2.setAddress("Pune");
  e2.setEsalary(60000);
  e2.setComp_name("AWS");
  e2.setGender('F');
  e2.setMobno(9587562245l);
  e2.setComp_add("Mumbai");
  e2.setDob("13th Jan 1999");
   e1.display(e2);
 }
}