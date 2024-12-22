import java.util.Scanner;

public class EvenSum 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            sum+=a[i];
        }
        System.out.println("Sum of Even elements="+sum);
    }
}
