import java.util.*;
import java.lang.*;
import java.io.*;

class Binary_String_Cost
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
                int xi=sc.nextInt();
                int y=sc.nextInt();
                String s=sc.next();
                int cx=0;
                int cy=0;
                boolean flag=false;
                for(int i=0;i<n-1;i++)
                {
                    
                    if((s.charAt(i)=='0'&&s.charAt(i+1)=='1')||(s.charAt(i)=='1'&&s.charAt(i+1)=='0'))
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println(Math.min(xi,y));
                    
                }
                else
                {
                    System.out.println("0");
                    
                }
            }
        }
        catch(Exception e)
        {}
    }
}