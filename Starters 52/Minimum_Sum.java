import java.util.*;

class Minimum_Sum
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int n=sc.nextInt();
                ArrayList<Integer> ar=new ArrayList<Integer>(n);
                for(int i=0;i<n;i++)
                {
                    ar.add(sc.nextInt());
                }
                long min=ar.stream().min(Long::compare).get();
                long mingcd=Long.MAX_VALUE;
                for(int x=0;x<n;x++)
                {
                    long y=gcd(min,ar.get(x));
                    mingcd=Math.min(mingcd,y);
                }
                // System.out.println("Max = "+min);

                System.out.println(mingcd*n);
                
                
            }
        }
        catch(Exception e) {}
    }
    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}