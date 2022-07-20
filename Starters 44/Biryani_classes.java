import java.util.*;
import java.lang.*;
import java.io.*;

class Biryani_classes
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
                int y=sc.nextInt();

                System.out.println(x*y);
                
            }
        }
        catch(Exception e) {}
    }
}