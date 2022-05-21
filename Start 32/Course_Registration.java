import java.util.*;
import java.lang.*;
import java.io.*;

class Course_Registration
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
                int b=sc.nextInt();
                int c=sc.nextInt();
                int diff=b-c;

                if(a<=diff)
                {
                    System.out.println("Yes");
                    
                }
                else
                {
                    System.out.println("No");
                    
                }
            }
        }
        catch(Exception e)
        {}
    }
}