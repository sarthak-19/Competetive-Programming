import java.util.*;
import java.lang.*;
import java.io.*;

class Air_Hockey
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int max=Math.max(x,y);
                System.out.println(7-max);
                
            }
        }
        catch(Exception e) {}
    }
}