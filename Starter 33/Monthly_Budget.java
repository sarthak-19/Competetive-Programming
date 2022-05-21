import java.util.*;
import java.lang.*;
import java.io.*;

class Monthly_Budget
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
                int tm=30*b;
                if(a<tm)
                {
                    System.out.println("NO");
                }
                else if(b<=a)
                {
                    System.out.println("YES");
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