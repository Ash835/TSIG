import java.util.Scanner;
public class Floor 
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
        System.out.println("Enter floor element");
        int target = ob.nextInt();
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
        int i=0;
        for(i=0;i<n;i++)
        {
            if(target<=a[i])
            {
                break;
            }
        }
        System.out.println((i-1)+":is the floor of:"+target);
    }
}
