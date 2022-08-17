import java.util.*;

class K_Flip
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
                int k=sc.nextInt();
                String s=sc.next();
                StringBuilder sb=new StringBuilder(s);
                for(int x=0;x<=n-k;x++)
                {
                    if(sb.charAt(x)=='1')
                    {
                        for(int y=x;y<x+k;y++)
                        {
                            if(sb.charAt(y)=='1')
                            {
                                sb.setCharAt(y,'0');
                            }
                            else
                            {
                                sb.setCharAt(y,'1');
                            }
                        }
                        x=x+k-1;
                    }
                }
                System.out.println(sb.toString());
            }
        }
        catch(Exception e) {}
    }
}