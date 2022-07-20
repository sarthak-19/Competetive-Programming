import java.util.*;
import java.lang.*;
import java.io.*;

class Buy_Lamps
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();
                int x=sc.nextInt();
                int y=sc.nextInt();

                int cr=k*x;
                n=n-k;
                int ans=cr+ (Math.min(x,y)*n);
                System.out.println(ans);
                
            }
        }
        catch(Exception e) {}
    }
}