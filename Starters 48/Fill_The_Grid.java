import java.util.*;
import java.lang.*;
import java.io.*;

class Fill_The_Grid
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
                int m=sc.nextInt();
                if(n==1 || m==1)
                {
                    int max=Math.max(n,m);
                    System.out.println(max);
                }
                else
                {
                    int totalTiles=n*m;
                    int row=n/2;
                    int col=m/2;

                    int ans= totalTiles- row*col*4;
                    System.out.println(ans);
                    
                }               
            }
        }
        catch(Exception e) {}
    }
}