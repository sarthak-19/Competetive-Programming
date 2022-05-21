import java.util.*;
import java.lang.*;
import java.io.*;

class Finding_Shoes
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int n=sc.nextInt();
                int m=sc.nextInt();
                int ans=0;
                if(n>m)
                {
                    ans=2*n-m;
                }
                else
                {
                    ans=n;
                }
                System.out.println(ans);
                

            }
        }
        catch(Exception e)
        {}
    }
}