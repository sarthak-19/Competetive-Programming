import java.util.*;

class High_Frequency
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int n=sc.nextInt();
                int ar[]=new int[n];
                int max=0;
                int subseq=0;
                for(int x=0;x<n;x++)
                {
                    ar[x]=sc.nextInt();
                    max=Math.max(max,ar[x]);
                }
                for(int x=0;x<n-1;x++)
                {
                    if(ar[x]==ar[x+1])
                    {
                        subseq++;
                    }
                }

                int freq[]=new int[max+1];
                Arrays.fill(freq,0);
                for(int x=0;x<n;x++)
                {
                    freq[ar[x]]++;
                }

                Arrays.sort(freq);

                int maxfreq=freq[freq.length-1];
                int secondmaxfreq=freq[freq.length-2];
                // System.out.println("maxFreq: "+maxx+" secondMax: "+secondmax+" subseq: "+subseq);

                if(maxfreq%2==0)
                {
                    maxfreq=maxfreq/2;
                }
                else
                {
                    maxfreq=(maxfreq+1)/2;
                }

                System.out.println(Math.max(maxfreq,secondmaxfreq ));
                

            }
        }
        catch(Exception e) {}
    }
}