public class Test
{
public static void main(String arg[])
 {
  Data d=new Data();
  Employee e1=d.m1();
  System.out.println("Employee ID:" +e1.getEid());
  System.out.println("Employee Name:" +e1.getEname());
  System.out.println("Employee Address:" +e1.getAddress());
  System.out.println("Employee Salary:" +e1.getEsalary());
  System.out.println("Company Name:" +e1.getComp_name());
  System.out.println("Employee Gender:" +e1.getGender());
  System.out.println("Employee MobNo:" +e1.getMobno());
  System.out.println("Company Address:" +e1.getComp_add());
  System.out.println("Employee DOB:" +e1.getDob());

  } 


}