public class Test
{
	public static void main(String arg[])
	{
		A a=DriverManager.getConnection();
		A a1=DriverManager.getConnection();
		System.out.println(a);
		System.out.println(a1);
	}
}