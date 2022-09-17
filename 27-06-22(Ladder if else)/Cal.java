import java.util.*;
public class Cal
{

   Scanner sc1=new Scanner(System.in);
 
  public void add()
    {
  System.out.println("Enter 1st Number");
       int j=sc1.nextInt();
  System.out.println("Enter 2st Number");
       int q=sc1.nextInt();
      int addition=j+q;
  System.out.println("Addition:" +addition);
    }

  public void sub()
    {
  System.out.println("Enter 1st Number");
       int j=sc1.nextInt();
  System.out.println("Enter 2st Number");
       int q=sc1.nextInt();
      int subtraction=j-q;
  System.out.println("Subtraction:" +subtraction);
    }

public void mul()
    {
    System.out.println("Enter 1st Number");
       int j=sc1.nextInt();
    System.out.println("Enter 2st Number");
       int q=sc1.nextInt();
      int multiplication=j*q;
      System.out.println("Multiplication:" +multiplication);
    }

public void div()
    {
  System.out.println("Enter 1st Number");
       int j=sc1.nextInt();
  System.out.println("Enter 2st Number");
       int q=sc1.nextInt();
      int division=j/q;

  System.out.println("Division:" +division);
    }

 }













