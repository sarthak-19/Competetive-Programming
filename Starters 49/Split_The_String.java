import java.util.*;

class Split_The_String
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
                int cz=0;
                int co=0;
                for(int x=0;x<s.length();x++)
                {
                    if(s.charAt(x)=='0')
                    {
                        cz++;
                    }
                    else
                    {
                        co++;
                    }
                }
                int ans=Math.abs(cz-co);

                // if(ans>k)
                // {
                //     ans=(int)Math.ceil((double)ans/(double)k);
                // }
                    ans=(int)Math.ceil((double)ans/(double)k);
                
                System.out.println(ans);
                
            }
        }
        catch(Exception e) {}
    }
}