import java.util.*;
import java.lang.*;
import java.io.*;

class Blackjack
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n1=sc.nextInt();          
                int n2=sc.nextInt();          
                // int n3=sc.nextInt();
                int ans=21-(n1+n2);
                System.out.println((ans<=10&&ans>=1)?ans:-1);      
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}