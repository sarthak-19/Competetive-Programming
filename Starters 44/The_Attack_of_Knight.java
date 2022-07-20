import java.util.*;
import java.lang.*;
import java.io.*;

class The_Attack_of_Knight
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int x1=sc.nextInt();
                int y1=sc.nextInt();

                int x2=sc.nextInt();
                int y2=sc.nextInt();                
                boolean found1=false;
                boolean found2=false;

                int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };//possible moves
                int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };//possible moves
                outer:
                for(int i=1;i<=8;i++)
                {
                    for(int j=1;j<=8;j++)
                    {
                        for(int k=0;k<8;k++)
                        {
                            int x=i+X[k];
                            int y=j+Y[k];

                             if (x >= 0 && y >= 0 && x < 9 && y < 9)//check if move valid
                             {
                                if(x==x1 && y==y1)
                                {
                                    found1=true;
                                    
                                    for(int p=0;p<8;p++)
                                    {
                                        int x_t=i+X[p];
                                        int y_t=j+Y[p];

                                         if (x_t >= 0 && y_t >= 0 && x_t < 9 && y_t < 9)
                                         {
                                            if(x_t==x2 && y_t==y2)
                                            {
                                                found2=true;
                                                break outer;
                                            }
                                         }
                                    }       
                                }
                             }
                        }

                        
                    }
                }

                if(found1==true && found2==true)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
                
            }
        }
        catch(Exception e) {}
    }
}