public class Armstrong 
{
    public static void main(String args[])
    {
        System.out.println("Armstrong nos. between 1-1000:");
        for(int i=1;i<=1000;i++)
        {
            int t=i,s=0,rem=0;
            while(t!=0)
            {
                rem=t%10;
                s+=(rem*rem*rem);
                t/=10;
            }
            if(s==i)
            System.out.print(i+"\t");
        }
    }
}
