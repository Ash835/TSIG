import java.util.Scanner;
public class SecondLargest 
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
        int t;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        int res=0,max=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
        max = a[i];
        }
    }
    for (int i=0;i<n;i++)
    {
        if(a[i]==max)
        {
            res=i;
            break;
        }
    }
        System.out.println("Second Largest element:"+a[res-1]);
        ob.close();
    }        
}

