import java.util.*;
import java.lang.*;
import java.io.*;

class Get_Lowest_Free
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n1=sc.nextInt();          
                int n2=sc.nextInt();          
                int n3=sc.nextInt();
                int tmin=Math.min(n1,n2);
                int ans=Math.min(tmin,n3);
                System.out.println((n1+n2+n3)-ans);
                          
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}