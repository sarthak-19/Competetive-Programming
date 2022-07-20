import java.util.*;
import java.lang.*;
import java.io.*;

class Construct_N
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
                if(n==1 || n==3 || n==5)
                {
                    System.out.println("NO");
                    
                }
                else
                {
                    System.out.println("YES");
                }
            }
        }
        catch(Exception e) {}
    }
}