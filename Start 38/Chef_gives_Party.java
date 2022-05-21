import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_gives_Party
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
                int x=sc.nextInt();
                int k=sc.nextInt();

                int money=n*x;
                if(money<=k)
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