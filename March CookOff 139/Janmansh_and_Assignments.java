import java.util.*;
import java.lang.*;
import java.io.*;

class Janmansh_and_Assignments
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
                if((n+3)<=10)
                {
                    System.out.println("Yes"); 
                }
                else
                {
                    System.out.println("No");
                    
                }
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}