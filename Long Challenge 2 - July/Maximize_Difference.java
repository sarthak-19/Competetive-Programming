import java.util.*;


class Maximize_Difference
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int m=sc.nextInt();
                int max=0;
                int ans=0;
                for(int x=n;x<=2*n;x++)
                {
                    int n1=x;
                    int n2= (m/x)*x;

                    int diff=n2-n1;
                    if(diff>max)
                    {
                        max=diff;
                        ans=x;
                    }
                }
                System.out.println(ans+" "+(m/ans)*ans);
                
            }
        }
        catch(Exception e) {}
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}