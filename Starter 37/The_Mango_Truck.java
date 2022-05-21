import java.util.*;
import java.lang.*;
import java.io.*;

class The_Mango_Truck
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
                int z=sc.nextInt();

                int temp=z-y;
                System.out.println(temp/x);
            }
        }
        catch(Exception e) {}
    }
}