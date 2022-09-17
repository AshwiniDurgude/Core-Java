import java.util.*;
public class Test
{
    public static void main(String arg[])
    {
        Data d=new Data();
        System.out.println("1 For First Student");
        System.out.println("2 For Second Student");
        System.out.println("3 For Third Student");
        System.out.println("4 For Fourth Student"); 
        Scanner sc1=new Scanner(System.in);
        int num=sc1.nextInt();
        if(num==1)
        {
            d.first_student();
        }
        else if(num==2)
        {
            d.second_student();
        }
        else if(num==3)
        {
            d.third_student();
        } 
        else if(num==4)
        {
            d.fourth_student();
        }  
        else
        {
            System.out.println("Enter correct choice");

        }
    }
}