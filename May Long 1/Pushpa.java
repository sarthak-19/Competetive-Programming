import java.util.*;
import java.lang.*;
import java.io.*;

class Pushpa
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

                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }

                Arrays.sort(arr);

                int c=1;
                int cmax=0;
                int temp=0;
                int max=0;
                for(int i=0;i<n-1;i++)
                {
                    if(arr[i]==arr[i+1])
                    {
                        c++;
                        if(i==n-2)
                        {
                            c++;
                        }
                        if(c>cmax)
                        {
                            cmax=c;
                            temp=arr[i];
                        }
                    }
                    else
                    {
                        c=1;
                    }
                }
                System.out.println(Math.max(arr[n-1],temp+cmax-1));
            }
        }
        catch(Exception e) {}
    }
}