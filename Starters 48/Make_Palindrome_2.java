import java.util.*;
import java.lang.*;
import java.io.*;

class Make_Palindrome_2
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
                String s=sc.next();

                int cz=0;
                int co=0;
                for(int x=0;x<n;x++)
                {
                    if(s.charAt(x)=='0')
                    {
                        cz++;
                    }
                    else
                    {
                        co++;
                    }
                }
                String ans="";
                if(cz == n || co==n)
                {
                    System.out.println(s);
                }
                else
                {
                    if(cz>=co)
                    {
                        for(int y=0;y<cz;y++)
                        {
                            ans=ans+"0";
                        }
                    }
                    else
                    {
                          for(int y=0;y<co;y++)
                          {
                            ans=ans+"1";
                          }
                    }
                }
                System.out.println(ans);
            }
        }
        catch(Exception e) {}
    }
}