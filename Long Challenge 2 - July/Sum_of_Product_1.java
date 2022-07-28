import java.util.*;

class Sum_of_Product_1
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
                long ar[]=new long[n];

                for(int x=0;x<n;x++)
                {
                    ar[x]=sc.nextInt();
                
                }
                long sum=0;

                long c=0;
                for(int x=0;x<n;x++)
                {
                    if(ar[x]==1)
                    {
                        c++;
                    }
                    else
                    {
                        sum+=c*(c+1)/2;
                        c=0;
                    }
                }
                if(ar[n-1]==1)
                {
                    sum+=c*(c+1)/2;
                }
                
                System.out.println(sum);
                
                
            }
        }
        catch(Exception e) {}
    }
}