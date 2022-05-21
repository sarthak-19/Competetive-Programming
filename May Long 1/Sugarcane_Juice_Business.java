import java.util.*;
import java.lang.*;
import java.io.*;

class Sugarcane_Juice_Business
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
                int total=x*50;

                int ans=(int)(0.3*total);
                System.out.println(ans);
            }
        }
        catch(Exception e) {}
    }
}