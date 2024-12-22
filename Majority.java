import java.util.Scanner;
class Majority 
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
        int mc=1, c=0,res=0;
        for(int i=c;i<n;i++)
        {
            c=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(mc<c)
            {
            mc=c;
            }
        }
        res=a[mc];
        System.out.println(mc);
        System.out.println("Majority occurrance is of:"+res+"\nOccurring:"+(mc+1)+" times");
        ob.close();
    }        
}
