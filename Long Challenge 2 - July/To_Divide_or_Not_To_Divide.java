import java.util.*;
import java.lang.*;
import java.io.*;

class To_Divide_or_Not_To_Divide
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int n=sc.nextInt();
                
                if(a%b==0)
                {
                    System.out.println("-1");
                }
                else
                {
                    int ans=n+a;
                    if(n%a==0)
                    {
                        ans-=a;
                    }
                    else
                    {
                        ans-=n%a;
                    }

                    if(ans%b!=0)
                    {
                        System.out.println(ans);
                    }
                    else
                    {
                        System.out.println(ans+a);
                    }
                }
            }
        }
        catch(Exception e) {}
    }
    public static int gcd(int a,int b)
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
}