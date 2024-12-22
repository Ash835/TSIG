import java.util.Scanner;

public class Distinct 
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
        int min=0,max=0;
        max=min=a[0];
        for(int i=0;i<n;i++)
        {
        if(a[i]>max)
        {
        max = a[i];
        }
        else if(a[i]<min)
        {
            min = a[i];
        }
        }
        int k=0,j=0,m=0;
        boolean res=false;
        for( k=min;k<max;k++)
        {
            res=false;
            for(j=0;j<n;j++)
            {
                if(a[j]==k)
                res=true;
            }
            if(res==false)
            m=k;
        }
        System.out.println("Missing:"+m);
    }
}
