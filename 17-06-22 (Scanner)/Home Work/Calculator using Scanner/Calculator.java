import java.util.*;
 public class Calculator
  {
 public int addition(int a,int b)
    {
      int sum=a+b;
        return sum;
     }

public int subtraction(int a,int b)
    {
      int sub=a-b;
        return sub;
     }

public int multiplication(int a,int b)
    {
      int multi=a*b;
        return multi;
     }

public int division(int a,int b)
    {
      int div=a/b;
        return div;
     }

public static void main(String arg[]) 
    {
     Calculator c=new Calculator();
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter 1st Value:");
       int x=sc.nextInt();

     System.out.println("Enter 2st Value:");
       int y=sc.nextInt();
      
       int s=c.addition(x,y);
       int s1=c.subtraction(x,y);
       int s2=c.multiplication(x,y);
       int s3=c.division(x,y);

     System.out.println("Addition:"+s);
     System.out.println("Subtraction:"+s1);
     System.out.println("Multiplication:"+s2);
     System.out.println("Division:"+s3);

    } 

  }