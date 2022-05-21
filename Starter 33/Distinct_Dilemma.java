import java.util.*;
import java.lang.*;
import java.io.*;

class Distinct_Dilemma
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
                int c=0;
                Arrays.sort(arr);
                for(int x=0;x<n-1;x++)
                {
                    if(arr[x]!=arr[x+1])
                    {
                        c++;
                    }
                }
                if(arr[n-1]!=arr[n-2])
                {
                    c++;
                }
                System.out.println(c);
            }
        }
        catch(Exception e) {}
    }
}