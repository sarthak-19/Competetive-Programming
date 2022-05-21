import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Cars_required
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int a=sc.nextInt();
                int ans=a/4;
                if(a%4!=0)
                {
                    ans++;
                }
                System.out.println(ans);
                
            }
        }
        catch(Exception e) {}
    }
}