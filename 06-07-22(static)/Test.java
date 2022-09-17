public class Test
{
	public static void main(String[] arg)
	{
		A a=new A();
		a.x=100;
		a.y=100;
		A a1=new A();
		a1.x=10;
		a1.y=10;
		A a2=new A();
		a2.x=1;
		a2.y=1;
		A a3=new A();
		System.out.println(a.x);//1
		System.out.println(a.y);//100
		System.out.println(a1.x);//1
		System.out.println(a1.y);//10
		System.out.println(a2.x);//1
		System.out.println(a2.y);//1
		System.out.println(a3.x);//1
		System.out.println(a3.y);//0
	}
}