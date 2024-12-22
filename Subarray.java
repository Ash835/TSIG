
import java.util.Scanner;
public class Subarray
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
        int maxSum=-1000,curSum=0,start=0,end=0,tstart=0;
        for(int i=0;i<n;i++)
        {
            curSum+=a[i];
            if(curSum>maxSum)
            {
                maxSum=curSum;
                start=tstart;
                end=i;
            }
            if(curSum<0)
            {
                curSum=0;
                tstart=i+1;
            }
        }
        System.out.println("Maximum Subarray sum:"+maxSum);
        System.out.print("Subarray:");
        for(int i=start;i<=end;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}


