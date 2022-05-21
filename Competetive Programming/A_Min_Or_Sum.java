import java.util.*;
public class A_Min_Or_Sum
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
            for(int x=0;x<n;x++)
            {
                ans=arr[x]|ans;
            }
            System.out.println(ans);
        }

        sc.close();
    }
}