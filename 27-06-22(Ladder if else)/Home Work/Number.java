import java.util.*;

public class Number
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");	
		int i=sc.nextInt();
		if(i>0)
          	{
			System.out.println("Number is Positive");
			if(i%2==0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is odd Number");
			}	
		}
		else
		{
			System.out.println("Number is -ve");
		}
	}
}