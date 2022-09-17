public class Test
 {
 public static void main(String arg[])
  {
D d=new D();
 d.m6();
 d.m2();
 d.m3();
 d.m1();
  System.out.println(d.x);
  System.out.println(d.y);
  System.out.println(d.m);
System.out.println(" ");

B b=new D();
 b.m2();
 b.m3();
 b.m1();
  System.out.println(b.y);
  System.out.println(b.x);
  System.out.println(d.m);
System.out.println(" ");

B b1=new B();
 b1.m2();
 b1.m3();
 b1.m1();
  System.out.println(b1.x);
  System.out.println(b1.y);
  System.out.println(b1.m);
System.out.println(" ");

A a=new A();
 a.m1();
 a.m2();
  System.out.println(a.x);
  System.out.println(a.y);
System.out.println(" ");

A a1=new B();
 a1.m2();
 a1.m1();
  System.out.println(a1.x);
  System.out.println(a1.y);
System.out.println(" ");

A a2=new C();
 a2.m1();
 a2.m2();
  System.out.println(a2.x);
  System.out.println(a2.y);
System.out.println(" ");

A a3=new D();
 a3.m2();
 a3.m1();
  System.out.println(a3.x);
  System.out.println(a3.y);
System.out.println(" ");

A a4=new E();
 a4.m1();
 a4.m2();
  System.out.println(a4.x);
  System.out.println(a4.y);
System.out.println(" ");

C c=new C();
 c.m1();
 c.m4();
 c.m2();
  System.out.println(c.x);
  System.out.println(c.y);
  System.out.println(c.z);
System.out.println(" ");

C c1=new E();
 c1.m1();
 c1.m4();
 c1.m2();
  System.out.println(c1.x);
  System.out.println(c1.y);
  System.out.println(c1.z);
System.out.println(" ");

E e=new E();
 e.m1();
 e.m3();
 e.m4();
 e.m5();
  System.out.println(e.x);
  System.out.println(e.y);
  System.out.println(e.z);
  System.out.println(e.m);
  System.out.println(e.n);
System.out.println(" ");

System.out.println("Stop");

  }
 }