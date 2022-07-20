import java.util.*;
import java.lang.*;
import java.io.*;

class Passes_for_Fair
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();

                if(n<k)
                {
                    System.out.println("YES");
                    
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
        catch(Exception e) {}
    }
}