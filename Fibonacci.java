import java.util.*;
public class Fibonacci 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter limit");
        int n = ob.nextInt();
        int a=0,b=1,c=0;
        if(n==1)
        {
            System.out.print(a);
        }
        else if(n==2)
        {
            System.out.print(a+"\t"+b);
        }
        else
        {
            System.out.print(a+"\t"+b+"\t");
            c=a+b;
            for(int i=3;i<=n;i++)
            {
                System.out.print(c+"\t");
                a=b;
                b=c;
                c=a+b;
            }
        }
    }
}

