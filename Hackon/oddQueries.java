import java.util.*;
import java.lang.*;
import java.io.*;

class Queries
{
    int q1;
    int q2;
    int q3;
    public Queries(int q1, int q2, int q3)
    {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }
}
class oddQueries
{
    public static void query1(int arr[],int prefix[],int q2,int q3)
    {
        int t=arr[q2];
        arr[q2] = q3;
        prefix[q2]=(prefix[q2]^(1<<15+t))^(1<<15+q3);
    }

    public static int query2(int arr[],int q2,int q3)
    {
        if(q2==0)
        {
            int number = arr[q3];
            return (Integer.bitCount(number));
        }
        else
        {
            int number = arr[q3]^arr[q2-1];
            return (Integer.bitCount(number));
        }
    }
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
                int prefix[]=new int[n];
                int q=sc.nextInt();
                int x=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                    x=x^(1<<(15+arr[i]));
                    prefix[i]=x;

                }
                Queries qr[]=new Queries[q];
                for(int i=0;i<q;i++)
                {
                    qr[i]=new Queries(sc.nextInt(),sc.nextInt(),sc.nextInt());
                }

                for(int i=0;i<q;i++)
                {
                    int q1=qr[i].q1;
                    int q2=qr[i].q2;
                    int q3=qr[i].q3;

                    if(q1==1)
                    {
                        query1(arr,prefix,q2,q3);
                    }
                    else
                    {
                        System.out.println(query2(prefix,q2,q3));
                    }
                }
            }

        }
        catch(Exception e) {}
    }
}