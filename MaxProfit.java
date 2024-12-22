import java.util.Scanner;

public class MaxProfit 
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
        int d=0,min=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                d=a[i]-a[j];
                if(min>d)
                min=d;
            }
        }
        if(min<=0)
        System.out.println("Maximum Profit:"+min/-1);
    }
}

