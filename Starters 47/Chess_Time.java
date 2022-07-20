import java.util.*;
import java.lang.*;
import java.io.*;

class Chess_Time
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int hr=sc.nextInt();
                int min=hr*60;
                System.out.println(min/20);
                
            }
        }
        catch(Exception e) {}
    }
}