import java.util.*;
import java.lang.*;
import java.io.*;

class Copy_and_Push_Back
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
                // System.out.println(n);
                String s=sc.next();
                if(n==0||n==1)
                {
                    System.out.println("YES");
                    continue;
                }
                // System.out.println(s);
                
                int l=s.length();
                boolean flag=true;
                while(l>0)
                {
                    if(l%2!=0)
                    {
                        l--;
                    }
                    else
                    {
                        int mid=l/2;
                        String s1=s.substring(0,mid);
                        String s2=s.substring(mid,l);
                        if(s1.equals(s2))
                        {
                            l=l/2;
                        }
                        else
                        {
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            
        }
        catch(Exception e) {}
    }
}