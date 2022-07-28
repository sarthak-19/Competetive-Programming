import java.util.*;

class Valid_Minimum
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int ar[]={a,b,c};
                Arrays.sort(ar);
                if(ar[0]==ar[1])
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
                
            }
        }
        catch(Exception e) {}
    }
}