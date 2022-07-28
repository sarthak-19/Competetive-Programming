import java.util.*;

class N_Buttons_1_Bulb
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
                String s=sc.next();
                String r=sc.next();
                int ans=1;
                for(int x=0;x<n;x++)
                {
                    if((s.charAt(x)=='0' && r.charAt(x)=='1') || s.charAt(x)=='1' && r.charAt(x)=='0')
                    {
                        if(ans==1)
                        {
                            ans=0;
                        }
                        else
                        {
                            ans=1;
                        }
                    }
                }
                System.out.println(ans);
                
            }
        }
        catch(Exception e) {}
    }
}