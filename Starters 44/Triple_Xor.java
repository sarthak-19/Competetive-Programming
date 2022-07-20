import java.util.*;
import java.lang.*;
import java.io.*;

class Triple_Xor
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc= new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();

                int c=0;

                long ans=(long)Math.pow(2,n)-1;
                ans=ans*(ans-1);
                System.out.println(ans);
                
            }
        }
        catch(Exception e) {}
    }
}