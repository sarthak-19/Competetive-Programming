import java.util.*;
import java.lang.*;
import java.io.*;

class Football_Cup
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

                if(x == y && (x>0||y>0))
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