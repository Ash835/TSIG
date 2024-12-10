class SumOfDigits
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int s=0,rem=0,rev;
        int t=n;
        while(n!=0)
        {
            rem=n%10;
            s+=rem;
            n/=10;
        }
        System.out.println("Sum of digits of="+s);
    }
}
