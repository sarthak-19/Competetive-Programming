import java.util.*;
import java.lang.*;
import java.io.*;

class Dominant_Army
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int arr[]=new int[3];
                arr[0]=sc.nextInt();
                arr[1]=sc.nextInt();
                arr[2]=sc.nextInt();

                Arrays.sort(arr);
                int max=arr[2];
                if(max>arr[0]+arr[1])
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