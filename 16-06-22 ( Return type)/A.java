public class A
 { 
 public int m1()
 { 
  System.out.println(" m1---A");
    return 20;
 }
 public float m2()
 { 
  System.out.println("M2---A");
    return 2.3f;
 }
 public static void main(String arg[])
 {
  System.out.println("Main Start");
   A a=new A();
    int x=a.m1();
    float z=a.m2();

  System.out.println(x);
  System.out.println(z);
  System.out.println("Main End");
 }
 }