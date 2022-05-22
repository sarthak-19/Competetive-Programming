import java.util.*;
import java.io.*;

class q1
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=1;i<=t;i++)
            {
                int n = sc.nextInt();
                // sc.next();
                String s = sc.next();
                // System.out.println("String = "+s);
                boolean isSeven=false;
                boolean isUpper=false;
                boolean isLower=false;
                boolean isDigit=false;
                boolean isSpecial=false;
                int l=s.length();
                if(l>=7)
                {
                    isSeven=true;
                }
                for(int x=0;x<l;x++)
                {
                    char ch=s.charAt(x);
                    if(Character.isUpperCase(ch))
                    {
                        isUpper=true;
                    }
                    else if(Character.isLowerCase(ch))
                    {
                        isLower=true;
                    }
                    else if(Character.isDigit(ch))
                    {
                        isDigit=true;
                    }
                    else
                    {
                        if(ch=='#'|| ch=='@'|| ch=='*'|| ch=='&')
                        {
                            isSpecial=true;
                        }
                    }
                }
                if(!isUpper)
                {
                    s+='A';
                }
                if(!isLower)
                {
                    s+='a';
                }
                if(!isDigit)
                {
                    s+='1';
                }
                if(!isSpecial)
                {
                    s+='#';
                }
                if(!isSeven)
                {
                    l=s.length();
                    for(int x=1;x<7-l;x++)
                    {
                        s+='1';
                    }
                }

                System.out.println("Case #"+i+": "+s);
            }    
        }
        catch(Exception e) {}
    }
}