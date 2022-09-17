public class Employee
{
 int eid;
 String ename;
 char gender;
 long phno;
 double esalary;
 String address;
public Employee(int eid,String ename,char gender,long phno,double esalary,String address)
{
this.eid=eid;
this.ename=ename;
this.gender=gender;
this.phno=phno;
this.esalary=esalary;
this.address=address;
}
public static void main(String args[])
{
 Employee e=new Employee(1,"abc",'f',1201201201,125711,"Pune");
//System.out.println("Employee:" +e.eid , +e.ename , +e.gender,   //+e.phno , +e.esalary , +e.address);

System.out.println("Employee ID: " +e.eid);
System.out.println("Employee Name: " +e.ename); 
System.out.println("Employee Gender: " +e.gender); 
System.out.println("Employee Phone No: " +e.phno); 
System.out.println("Employee Salary: " +e.esalary);
System.out.println("Employee Address: " +e.address);
 
}
}