import java.util.*;

class Hungry_Chef
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int n=sc.nextInt();
                int r=sc.nextInt();

                int ans=0;
                if(r/n<x)
                {
                    System.out.println("-1");
                }
                else
                {
                    int mid=n/2;
                    int l=0;
                    int high=n;

                    while(l<=high)
                    {
                        mid=(l+high)/2;
                        if(mid*y+(n-mid)*x<=r)
                        {
                            l=mid+1;
                            ans=mid;
                        }
                        else
                        {
                            high=mid-1;
                        }
                    }
                    System.out.println(n-ans+" "+ans);
                }
            }
        }
        catch(Exception e) {}
    }
}