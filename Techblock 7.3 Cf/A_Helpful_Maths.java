import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Helpful_Maths
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            String s=sc.nextLine();
            int l=s.length();
            int l1=0;
            int l2=0;
            int l3=0;
            for(int x=0;x<l;x++)
            {
                if(s.charAt(x)=='1')
                {
                    l1++;
                }
                else if(s.charAt(x)=='2')
                {
                    l2++;
                }
                else if(s.charAt(x)=='3')
                {
                    l3++;
                }
            }

        String output="";
        for(int x=0; x<l1; x++)
            output += "1+";
        for(int x=0; x<l2; x++)
            output += "2+";
        for(int x=0; x<l3; x++)
            output += "3+";
         System.out.println(output.substring(0, output.length()-1));

        }
        catch(Exception e) {}
    }
}