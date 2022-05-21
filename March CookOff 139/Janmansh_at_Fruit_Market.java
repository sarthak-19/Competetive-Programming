import java.util.*;
import java.lang.*;
import java.io.*;

class Janmansh_at_Fruit_Market
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();

                int fmin=Math.min(Math.min(a,b),c);
                int smin=(a+b+c)-fmin-(Math.max(Math.max(a,b),c));
                int ans=fmin*(x-1)+smin;
                System.out.println(ans);
                
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}