import java.util.*;
public class Add
{
  public int addition(int a,int b)
   {
     int sum=a+b;
       return sum;
   }
public static void main(String arg[]) 
  {
   Add a=new Add();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st Value:");
    int x=sc.nextInt();
   System.out.println("Enter 2nd Value:");
    int y=sc.nextInt();
       int z=a.addition(x,y);
   System.out.println(z);
  }

}