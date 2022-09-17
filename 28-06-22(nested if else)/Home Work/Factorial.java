import java.util.*;
public class Factorial
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt(); 
		//int no=5;
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;

		}
		System.out.println("Factorial is:" +fact);
	}
}