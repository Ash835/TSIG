import java.util.Scanner;

public class Rotate 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = ob.nextInt();
        int a[] = new int[n];
        int c[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }
        System.out.println("Enter no. of positions to be shifted:");
        int k = ob.nextInt();
        for(int i=0;i<k;i++)
        {
            c[i]=a[n-k+i];
        }
        for(int i=0;i<n-k;i++)
        {
            c[k+i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
