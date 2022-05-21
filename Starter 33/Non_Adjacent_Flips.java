import java.util.*;
import java.lang.*;
import java.io.*;

class Non_Adjacent_Flips
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
                String s=sc.next();
                boolean cOne=false;
                boolean isOne=false;
                for(int x=0;x<n-1;x++)
                {
                    if(s.charAt(x)=='1' || s.charAt(x+1)=='1')
                    {
                        cOne=true;
                    }
                    
                    if(s.charAt(x)=='1' && s.charAt(x+1)=='1')
                    {
                        isOne=true;
                        break;
                    }
                    
                }
                if(isOne==false&&cOne==true)
                {
                    System.out.println(1);
                }
                else if(cOne==false)
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(2);
                }
            }
        }
        catch(Exception e) {}
    }
}