import java.util.*;
import java.lang.*;
import java.io.*;

class Fill_Candies
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
                int m=sc.nextInt();

                System.out.println((int)Math.ceil((double)n/(double)(m*k)));
                
            }
        }
        catch(Exception e) {}
    }
}