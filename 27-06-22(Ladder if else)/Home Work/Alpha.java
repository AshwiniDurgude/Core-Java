import java.util.*;

public class Alpha
{
    public static void main(String arg[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character:");	
	char i=sc.nextChar();
        if(i>0)
          {
           System.out.println("Number is +ve");
          }
       else
          {
           System.out.println("Number is -ve");
          }
       else if(i%2==0)
          {
           System.out.println("Number is Even");
          }
       else
          {
           System.out.println("Number is odd");
          }
      
      }
}