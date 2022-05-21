import java.util.*;
import java.lang.*;
import java.io.*;

class Roller_Coaster
{
    public static void main (String[] args) throws Exception
    {
        try
        {
           Scanner sc = new Scanner(System.in);
           int t=sc.nextInt();
              while(t-->0)
              {
                    int x=sc.nextInt();
                    int h=sc.nextInt();
                    if(x<h)
                    {
                        System.out.println("NO");
                    }
                    else
                    {
                        System.out.println("YES");
                    }
              } 
        }
        catch(Exception e) {}
    }
}