
public class B extends A
{
	public B()
	{
		super(30);
		System.out.println("Cont--B");
	}
	public B(String s1)
	{
		this();
		System.out.println("Cont--B--S1");
	}
	public B(String s1,String s2)
	{
		this("Abc");
		System.out.println("Cont--B--S1&S2");

	}	
}