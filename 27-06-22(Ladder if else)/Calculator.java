import java.util.*;
public class Calculator
 {
 
  public static void main(String arg[])
  {
    Cal c=new Cal();
   System.out.println("1 for addition");
   System.out.println("2 for Subtraction");
   System.out.println("3 for Multiplication");
   System.out.println("4 for Division");
   Scanner sc=new Scanner(System.in);
       int ch=sc.nextInt();
   if(ch==1)
     {
       c.add();   
     }
  else if(ch==2)
     {
      c.sub();   
     }

  else if(ch==3)
     {
       c.mul();   
     }

  else if(ch==4)
     {
       c.div();   
     }
  else
     {
      System.out.println("Enter Correct Number");
     }
   }
}