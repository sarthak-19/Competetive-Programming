import java.util.*;
import java.lang.*;
import java.io.*;

class Janmansh_and_Coins
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int ten=sc.nextInt();
                int five=sc.nextInt();
                System.out.println((ten*10)+(five*5));
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}