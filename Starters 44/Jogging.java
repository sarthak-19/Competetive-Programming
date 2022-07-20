import java.util.*;
import java.lang.*;
import java.io.*;

class Jogging
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int mod=1000000007;
                int n=sc.nextInt();
                int x=sc.nextInt();

                long ans=x*power(2,n-1,mod);

                
                System.out.println(ans%mod);
                
            }
        }
        catch(Exception e) {}
    }
    // ref https://www.geeksforgeeks.org/find-abm-where-b-is-very-large/
    static long power(long x,long y, long p)
    {
	    long res = 1; // Initialize result

	    // Update x if it is more
	    // than or equal to p
	    x = x % p;

	    while (y > 0)
	    {
	    	// If y is odd, multiply
	    	// x with the result
	    	if ((y & 1) > 0)
	    		res = (res * x) % p;

	    	// y must be even now
	    	y = y >> 1; // y = y/2
	    	x = (x * x) % p;
	    }
	    return res;
    }

}