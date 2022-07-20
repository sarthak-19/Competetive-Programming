import java.util.*;
import java.lang.*;
import java.io.*;

class minimumSum
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                String s=sc.next();
                int n1=0;
                int n2=0;

                char tempArray[] = s.toCharArray();
 
                // Sorting temp array using
                Arrays.sort(tempArray);

                // Returning new sorted string
                s=new String(tempArray);

                int i=0;
                while(i<s.length())
                {
                    if(i%2==0)
                    {
                        n1=n1*10+(s.charAt(i)-'0');
                    }
                    else
                    {
                        n2=n2*10+(s.charAt(i)-'0');
                    }
                    i++;
                }
                System.out.println(n1+n2);
            }
        }
        catch(Exception e) {}
    }
}