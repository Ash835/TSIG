class Factorial 
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
        int f=1,i=1;
        for(i=1;i<=n;i++)
        f*=i;
        System.out.println("Factorial of "+n+"="+f);
    }
}
