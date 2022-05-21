import java.util.*;
import java.lang.*;
import java.io.*;

class Dazzling_Even
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int ar[]=new int[n];
                int minOdd=Integer.MAX_VALUE;
                int maxOdd=0;

                int minEven=Integer.MAX_VALUE;
                int maxEven=0;
                for(int x=0;x<n;x++)
                {
                    ar[x]=sc.nextInt();
                    if(ar[x]%2==0)
                    {
                        if(minEven>ar[x])
                            minEven=ar[x];
                        if(maxEven<ar[x])
                        {
                            maxEven=ar[x];
                        }
                    }
                    else
                    {
                        if(minOdd>ar[x])
                            minOdd=ar[x];
                        if(maxOdd<ar[x])
                        {
                            maxOdd=ar[x];
                        }
                    }
                }
                int odiff=maxOdd-minOdd;
                int ediff=maxEven-minEven;

                if(odiff==0)
                {
                    if(ediff==0)
                    {
                        System.out.println("YES");
                    }
                    else if(ediff>2&&ediff<=4)
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
                else if(ediff==0)
                {
                    if(odiff>2&&odiff<=4)
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
                else
                {
                    if(odiff>=2&&odiff<=4&&ediff>=2&&ediff<=4)
                    {
                        System.out.println("YES");
                    }
                    else
                    {
                        System.out.println("NO");
                    }
                }
            }
        }
        catch(Exception e) {}
    }
}