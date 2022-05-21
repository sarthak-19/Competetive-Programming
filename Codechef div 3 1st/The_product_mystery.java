import java.util.*;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class The_product_mystery
{
    public static long gcd(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                long n1=sc.nextInt();
                long n2=sc.nextInt();
                long gcd=gcd(n1, n2);
                long lcm=(n1*n2)/gcd;
                System.out.println(lcm/n1);
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}