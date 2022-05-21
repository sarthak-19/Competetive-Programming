import java.util.*;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class Too_many_items
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
                int ans=n/10;
                if(n%10>=1&&n%10<=9)
                {
                    ans++;
                }
                System.out.println(ans);
                      
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}