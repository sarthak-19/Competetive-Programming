import java.util.*;
import java.lang.*;
import java.io.*;

class Shopping_Change
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
                System.out.println(100-n);              
            }
        }
        catch(Exception e) {}
    }
}