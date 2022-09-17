import java.util.*;
public class Grade
{
 public static void main(String arg[])
  {
   int b[]=new int[6];
   int i;
   float total=0,avg;

   Scanner sc1=new Scanner(System.in);
   for(i=0;i<6;i++)
   	{
	  System.out.println("Enter marks of subject " +(i+1)+":");
		 b[i]=sc1.nextInt();
		total=total+b[i];

   	}
          System.out.println("Total marks is:"+total);
  	avg=total/6;
    	System.out.println("The Student Grade is:");
	if(avg>=85)
	{
     	System.out.println("A+");         
	}
	else if(avg>=75 && avg<85)
	{
     	System.out.println("A");         
	}
	else if(avg>=65 && avg<75)
	{
     	System.out.println("B");         
	}
	else if(avg>=55 && avg<65)
	{
     	System.out.println("C");         
	}
	else if(avg>=45 && avg<55)
	{
     	System.out.println("D");   
	}
	else if(avg>=35)
	{
     	System.out.println("Pass");         
	}
 	else
	{
     	System.out.println("Fail");  
	}
 }

}