import java.util.*;
import java.lang.*;
import java.io.*;

class Alternating_Divisibility
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
                int arr[]=new int[n];
                // int c=1;
                int max=(2*n)+1;
                int min=2;
                arr[0]=1;
                boolean flag;
                for(int x=1;x<n;x++)
                {
                    int number=(int)(Math.random()*(max - min + 1)+min); //3
                    System.out.println("Number = "+number);
                    flag=true;
                    System.out.println("flag="+flag);
                    
                    if(x%2!=0)
                    {
                        System.out.println("Inside Odd");
                        
                        if((number%arr[x-1]!=0))
                        {
                            System.out.println("Number check = "+number);
                            System.out.println("arr[x-1] = "+arr[x-1]);
                            
                            
                            flag=false;
                            x--;
                            continue;
                        }
                    }
                    if(x%2==0)
                    {
                        System.out.println("Inside even");
                        
                        if(number%arr[x-1]==0)
                        {
                            flag=false;
                            x--;
                            continue;
                        }
                    }
                    if(arr[x-1]==number)
                    {
                        flag=false;
                        x--;
                        continue;
                    }
                    arr[x]=number;
                    System.out.println("X ki value = "+x);
                    
                }

                for(int x=0;x<n;x++)
                {
                    System.out.print(arr[x]+" ");
                    
                }
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}