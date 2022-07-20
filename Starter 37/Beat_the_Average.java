import java.util.*;
// import java.lang.*;
// import java.io.*;

class Beat_the_Average
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();
            while(t-- != 0)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int x = sc.nextInt();
                
                if(m == x)
                    System.out.println("0");
                else
                {
                    int ans=0;
                    if(n%x==0)
                    {
                        ans=n-n/x;
                    }
                    else
                    {
                        ans=n-(n/x +1);
                    }
                    System.out.println(ans);
                }             
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}