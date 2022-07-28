import java.util.*;


class Chef_in_his_Office
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();

                System.out.println(4*x+y);
            }
        }
        catch(Exception e) {}
    }
}