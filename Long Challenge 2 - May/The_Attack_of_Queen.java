import java.util.*;
import java.lang.*;
import java.io.*;

class The_Attack_of_Queen
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int x=sc.nextInt();
                int y=sc.nextInt();

                int ans=0;
                int rc=2*(n-1);
                // int rd=n-(Math.abs(x-y)+1);
                // int ld=n-Math.abs(x+y-n-2);

                int d=2*n-2-Math.abs(x-y)-Math.abs(x+y-n-1);

                ans+=rc+d;
                System.out.println(ans);
            }
        }
        catch(Exception e) {}
    }
}