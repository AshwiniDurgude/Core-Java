public class A
{
    public void m1()
    {
        System.out.println("m1--A");
    }
    public int m2()
    {
        System.out.println("M2--A");
        return 10;
    }
    
}
public class B extends A
{
    public void m1()
    {
        System.out.println("M1--B");
    }
    public int m2()
    {
       System.out.println("M2--B");
       return 20; 
    }
    protected int m3()
    {
       System.out.println("M3--B"); 
       return 15;
    }  
}
public static void main(String arg[])
{
    A a=new A();
    B b=new B();
    a.m1();
    a.m2(10);
    b.m1();
    b.m2(20);
    b.m3(15);
    System.out.println(a.m1());
    System.out.println(a.m2());
    System.out.println(b.m1());
    System.out.println(b.m2());
    System.out.println(b.m3());
}
}