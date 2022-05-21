import java.util.*;
import java.lang.*;
import java.io.*;

class Get_Subscription
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int test_cases = sc.nextInt();
            while(test_cases-- > 0)
            {
                int n = sc.nextInt();
                if(n<=30)
                System.out.println("NO");
                else
                System.out.println("YES");
            }
        }
        catch(Exception e) {}
    }
}