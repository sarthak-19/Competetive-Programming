import java.util.*;
import java.lang.*;
import java.io.*;

class Make_Them_Equal
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
                int arr[]=new int[n];
                int co=0;
                int ce=0;
                int ans=-1;
                for(int x=0;x<n;x++)
                {
                    arr[x]=sc.nextInt();
                    if(arr[x]%2==0)
                    {
                        ce++;
                    }
                    else
                    {
                        co++;
                    }
                }
                if(co==0||ce==0)
                {
                    ans=0;
                }
                else if(co<ce)
                {
                    if(co%2==0)
                    {
                        ans=co/2;
                    }
                    else
                    {
                        ans=ce;
                    }
                }
                else if(co>ce)
                {
                    if(co%2==0)
                    {
                        ans=Math.min(ce,co/2);
                    }
                    else
                    {
                        ans=ce;
                    }
                }
                else
                {
                    if(co%2==0)
                    {
                        ans=co/2;
                    }
                    else
                    {
                        ans=ce;
                    }
                }
                System.out.println(ans);
                
                
            }
        }
        catch(Exception e) {}
    }
}