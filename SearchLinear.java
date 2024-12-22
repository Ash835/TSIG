import java.util.Scanner;
public class SearchLinear 
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
        System.out.println("Enter element to be searched");
        int target = ob.nextInt();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(target==a[i])
            {
                System.out.println(target+":Found at position:"+(i+1));
                j=1;
            }
        }
        if(j!=1)
        System.out.println("Element not found");
    }
}
