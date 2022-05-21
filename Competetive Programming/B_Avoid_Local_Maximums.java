import java.util.*;
public class B_Avoid_Local_Maximums
{
    public static void main(String args[])
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
            int ans=0;
            for(int x=1;x<n-1;x++)
            {
                if(arr[x]>arr[x-1] && arr[x]>arr[x+1])
                {
                    if(x==n-3)
                    {
                        arr[x]=arr[x+1];
                    }
                    else if(x==n-4)
                    {
                        arr[x+1]=arr[x];
                    }
                    else if(x==1)
                    {
                        continue;
                    }
                    else if(arr[x-1]==arr[x+1])
                    {
                        arr[x+1]=arr[x];
                    }
                    else
                    {
                        arr[x-1]=arr[x];
                    }
                    ans++;
                }
            }
            System.out.println(ans);
            for(int x=0;x<n;x++)
            {
                System.out.print(arr[x]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}