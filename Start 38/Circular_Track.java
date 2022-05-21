import java.util.*;
import java.lang.*;
import java.io.*;

class Circular_Track
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int test_cases = sc.nextInt();
            while(test_cases-- > 0)
            {
                int a = sc.nextInt();
                int b=sc.nextInt();
                int m=sc.nextInt();

                int a1=Math.abs(a-b);
                int a2=Math.abs(m-a1);
                System.out.println(Math.min(a1,a2));
            }

        }
        catch(Exception e) {}
    }
}