import java.util.*;
import java.lang.*;
import java.io.*;

class Maximize_the_Minimum
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
                int i=sc.nextInt();
                int arr[]=new int[n];

                for(int x=0;x<n;x++)
                {
                    arr[x]=sc.nextInt();
                }
                Arrays.sort(arr);

                if(i<=n-1)
                {
                    System.out.println(arr[i]);
                    
                }
                else
                {
                    System.out.println(arr[n-1]);
                    
                }
            }
        }
        catch(Exception e)
        {}
    }
}