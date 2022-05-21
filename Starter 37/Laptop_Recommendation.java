import java.util.*;
import java.lang.*;
import java.io.*;

class Laptop_Recommendation
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- != 0)
            {
                int n = sc.nextInt();
                int freq[] = new int[11];
                for(int x=0; x<n; x++)
                    freq[sc.nextInt()]++;
                
                int maxFreqIndex = 1;
                for(int x=2; x<=10; x++)
                {
                    if(freq[x] > freq[maxFreqIndex])
                        maxFreqIndex = x;
                }
                int c=0;
                for(int x=1; x<=10; x++)
                {
                    if(freq[x] == freq[maxFreqIndex])
                        c++;
                }
                if(c>=2)
                    System.out.println("CONFUSED");
                else
                    System.out.println(maxFreqIndex);
                
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}