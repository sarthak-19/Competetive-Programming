import java.util.*;
import java.lang.*;
import java.io.*;

class Volume_Control
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
                int ans=(int)Math.abs(a-b);
                System.out.println(ans);
            }
        }
        catch(Exception e)
        {}
    }
}