import java.util.*;
import java.lang.*;
import java.io.*;

class Positive_array
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

                for(int x=0;x<n;x++)
                {
                    arr[x]=sc.nextInt();
                }

                Arrays.sort(arr);
                int ans=0;
                for(int x=0;x<n;x++)
                {
                    int tempAns=(int)Math.ceil((double)(x+1)/(double)arr[x]);
                    ans=Math.max(tempAns,ans);
                }
                System.out.println(ans);
            }
        }
        catch(Exception e) {}
    }
}