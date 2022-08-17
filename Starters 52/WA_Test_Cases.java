import java.util.*;

class WA_Test_Cases
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
                int ar[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    ar[i]=sc.nextInt();
                }
                StringBuilder sb=new StringBuilder();
                sb.append(sc.next());

                int min=Integer.MAX_VALUE;
                for(int x=0;x<n;x++)
                {
                    if(sb.charAt(x)=='0')
                    {
                        min=Math.min(min,ar[x]);
                    }
                }
                System.out.println(min);
                
            }
        }
        catch(Exception e) {}
    }
}