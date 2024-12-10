public class MinMax 
{
    public static void main(String args[])
    {
    int a[] =  {8,7,9,4,2,5};
    int min=0,max=0;
    max=min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
        max = a[i];
        }
        else if(a[i]<min)
        {
            min = a[i];
        }
    }
System.out.println("Min="+min);
System.out.println("Max="+max);
}
}
    
