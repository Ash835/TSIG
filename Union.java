import java.util.Scanner;
public class Union
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array 1:");
        int n = ob.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array 1:");
        for(int i=0;i<n;i++)
        {
        a[i]=ob.nextInt();
        }
        System.out.println("Enter size of array 2:");
        int m = ob.nextInt();
        int b[]=new int[m];
        System.out.println("Enter array 2:");
        for(int i=0;i<m;i++)
        b[i]=ob.nextInt();
        int c[]= new int[m+n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            c[j]=a[i];
            j++;
        }
        for(int i=0;i<m;i++)
        {
            c[j]=b[i];
            j++;
        }
        int t;
        for(int i=0;i<j;i++)
        {
            for(int k=i+1;k<j;k++)
            {
                if(c[i]>c[k])
                {
                    t=c[i];
                    c[i]=c[k];
                    c[k]=t;
                }
            }
        }  
        for(int i=0;i<j-1;i++)
        {
            if(c[i]!=c[i+1])
            System.out.print(c[i]+"\t");
        }
        System.out.print(c[j-1]);
    }
}
