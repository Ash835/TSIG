public class OddEve {
 public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int c1=0,c2=0,rem=0,rev;
        int t=n;
        while(n!=0)
        {
            rem=n%10;
            if(rem%2==0)
            c1++;
            else
            c2++;
            n/=10;
        }
        System.out.println("No. of odd nos="+c2);
        System.out.println("No. of even nos="+c1);
    }
}

