import java.util.*;
import java.lang.*;
import java.io.*;

class q2
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=1;i<=t;i++)
            {
                int n=sc.nextInt();
                int x=sc.nextInt();
                int y=sc.nextInt();

                int ar[]=new int[n];
                for(int k=0;k<n;k++)
                {
                    ar[k]=k+1;
                }
                int nx=x;
                int ny=y;
                int totSum=(n*(n+1))/2;

                int var=2;
                boolean check=false;
                while(nx<totSum && ny<totSum)
                {
                    if(isSubsetSum(ar,n,nx) && totSum-nx==ny)
                    {
                        // System.out.println("YES");
                        check=true;
                        break;
                    }
                    else
                    {
                        nx=x*var;
                        ny=y*var;
                        var++;
                    }
                }
                if(check)
                {
                    System.out.println("Case #"+i+": POSSIBLE");
                }
                else
                {
                    System.out.println("Case #"+i+": IMPOSSIBLE");
                }

            }  
        }
        catch(Exception e) {}
    }
    public static boolean isSubsetSum(int set[],int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
 
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
 
        /* else, check if sum can be obtained
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
}