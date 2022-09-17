public class Emp
{
 public static void main(String Args[])
 { 
  Employee e=new Employee();
    e.setEid(1);
    e.setEname("Ram");
    e.setAddress("Pune");
    e.setEsalary(45000);
    e.setComp_name("abs");
    e.setGender('M');
    e.setMobno(1000000567);
    e.setComp_add("Nashik");
    e.setDob("23 Sept 2000");

  System.out.println("Employee ID:" +e.getEid());
  System.out.println("Employee Name:" +e.getEname());
  System.out.println("Employee Address:" +e.getAddress());
  System.out.println("Employee Salary:" +e.getEsalary());
  System.out.println("Company Name:" +e.getComp_name());
  System.out.println("Employee Gender:" +e.getGender());
  System.out.println("Employee MobNo:" +e.getMobno());
  System.out.println("Company Address:" +e.getComp_add());
  System.out.println("Employee DOB:" +e.getDob());
 }
}