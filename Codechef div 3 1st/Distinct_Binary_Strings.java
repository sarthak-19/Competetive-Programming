import java.util.*;
import java.util.function.Function;
import java.lang.*;
import java.io.*;

class Distinct_Binary_Strings
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int l=sc.nextInt();
                String s=sc.next();
                int c=0;
                for(int x=0;x<l-1;x++)
                {
                    if(s.charAt(x)==s.charAt(x+1))
                    {
                        c++;
                    }
                }
                System.out.println(l-c);
                
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}