import java.util.*;
import java.lang.*;
import java.io.*;

class Mystical_Numbers
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int arr[]=new int[n];
                int psum[]=new int[n];
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                    sum+=arr[i];
                    psum[i]=sum;
                }
                int q = sc.nextInt();
                while(q-- > 0)
                {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int x = sc.nextInt();
                    int tsum=0;
                    if(l==1)
                        tsum=psum[r-1];
                    else
                        tsum=psum[r-1]-psum[l-2];
                    
                    if(tsum%2!=0)
                    {
                        System.out.println((tsum&x)-1);
                    }
                    else
                    {
                        System.out.println(tsum&x);
                    }

                }
            }
        }
        catch(Exception e) {}
    }
}