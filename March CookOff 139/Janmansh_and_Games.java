import java.util.*;
import java.lang.*;
import java.io.*;

class Janmansh_and_Games
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();

                if(((x+y)&1)==1)
                {
                    System.out.println("Jay");
                    
                }
                else
                {
                    System.out.println("Janmansh");
                    
                }
                
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}