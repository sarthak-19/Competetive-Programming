import java.util.*;
import java.lang.*;
import java.io.*;

class The_Cheaper_Cab
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

                if(a<b)
                {
                    System.out.println("FIRST");
                    
                }
                else if(b<a)
                {
                    System.out.println("SECOND");
                    
                }
                else
                {
                    System.out.println("ANY");
                    
                }
            }
        }
        catch(Exception e) {}
    }
}   