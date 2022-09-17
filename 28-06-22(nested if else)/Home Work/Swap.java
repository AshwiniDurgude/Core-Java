import java.util.*;
public class Swap
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		int a=sc.nextInt();
		System.out.println("Enter value of B:");
		int b=sc.nextInt();
		//int a=20;
		//int b=10;
		int z;
		z=a;
		a=b;
		b=z;
		System.out.println("A:" +a);
		System.out.println("B:" +b);
	}
}