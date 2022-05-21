import java.util.*;
import java.lang.*;
import java.io.*;

class Infernos
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- != 0)
            {
                int n = sc.nextInt();
                int d=sc.nextInt();

                int h[]=new int[n];
                int max=0;
                for(int x=0;x<n;x++)
                {
                    h[x]=sc.nextInt();
                    if(h[x]>max)
                    {
                        max=h[x];
                    }
                }

                int t_multi=max;

                int t_single=0;
                for(int x=0;x<n;x++)
                {
                    int temp=h[x]/d;
                    if(h[x]%d==0)
                    {
                        t_single+=temp;
                    }
                    else
                    {
                        t_single+=temp+1;
                    }
                }

                System.out.println(Math.min(t_multi,t_single));
            }

        }
        catch(Exception e) {}
    }
}