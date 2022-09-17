public class Emp_obj
{
 int eid;
 String ename;
 char gender;
 long phno;
 double esalary;
 String address;
public static void main(String args[])
{
 Emp_obj e=new Emp_obj();
  e.eid=11;
  e.ename="Ashu";
  e.gender='f';
  e.phno=1234567890;
  e.esalary=124562;
  e.address="pune";

System.out.println("Employee ID:" +e.eid);
System.out.println("Employee Name:" +e.ename); 
System.out.println("Employee Gender:" +e.gender); 
System.out.println("Employee Phone No:" +e.phno); 
System.out.println("Employee Salary:" +e.esalary);
System.out.println("Employee Address:" +e.address);
 
}
}
