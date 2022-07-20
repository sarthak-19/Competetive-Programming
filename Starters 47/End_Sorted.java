import java.util.*;

class End_Sorted
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
                int i1=0;
                int in=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                    if(arr[i]==1)
                    {
                        i1=i;
                    }
                    else if(arr[i]==n)
                    {
                        in=i;
                    }
                }
                int count=0;
                if(i1==0 && in+1==n)
                {
                    System.out.println(0);
                }
                else if(i1<in)
                {
                    System.out.println(i1+(n-in-1));
                }
                else
                {
                    int ans=i1+(n-in-1)-1;
                    System.out.println(ans);
                }
            }
        }
        catch(Exception e) {}
    }
}