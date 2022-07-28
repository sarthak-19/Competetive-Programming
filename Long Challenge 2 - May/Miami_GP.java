import java.util.*;
import java.lang.*;
import java.io.*;

class Miami_GP
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();

                double limit=1.07*x;
                if(y<=limit)
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