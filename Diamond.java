import java.util.Scanner;
public class Diamond
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = ob.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

