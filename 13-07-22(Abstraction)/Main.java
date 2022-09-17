
 abstract class Programming
{
	Programming()
	{
		System.out.println("All Programming Language..");
	}
	public abstract void Developer();
	public abstract void Rank();

}
 class Html extends Programming
{
	Html()
	{
		super();
	}


	
	public void Developer()
	{
		System.out.println(" HTML Developer: Tim Berners Lee");	
	}
	
	public void Rank()
	{
		System.out.println(" Rank: 3rd");	
	}
	
	
}
class Java extends Programming
{
	Java()
	{
		super();
	}
	
	public void Developer()
	{
		System.out.println(" Java Developer: James Gosling");	
	}
	
	public void Rank()
	{
		System.out.println(" Rank: 2nd");	
	}
	
	
}
class Main
{
	public static void main(String[] arg)
	{
		Programming h=new Html();
		h.Developer();
		h.Rank();
		Java j=new Java();
		j.Developer();
		j.Rank();
	}
}