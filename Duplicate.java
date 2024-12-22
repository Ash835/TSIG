import java.util.Scanner;
public class Duplicate 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter size");
        int n= ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++)
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
        int c=0;
        int min = a[0];
        int max = a[n-1];
        for(int i=min;i<=max;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i==a[j])
                {
                    c++;
                }
            }
            if(c>1)
                System.out.println("duplicate:"+i);
        }
        ob.close();
    }
}