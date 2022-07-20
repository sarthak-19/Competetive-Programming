import java.util.*;

class Similar_Heights
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
                HashMap<Integer,Integer> hm=new HashMap<>();
                double c1=0;
                int c2=0;
                int cx=0;
                int maxValue=0;
                int maxCount=0;
                int unMax=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                    if(hm.containsKey(arr[i]))
                    {
                        hm.put(arr[i],hm.get(arr[i])+1);
                    }
                    else
                    {
                        hm.put(arr[i],1);
                    }
                    maxCount=Math.max(maxCount,hm.get(arr[i]));
                    maxValue=Math.max(maxValue,arr[i]);
                }
                for(int i=0;i<n;i++)
                {
                    if(hm.get(arr[i])==1)
                    {
                        c1++;
                        unMax=Math.max(unMax,arr[i]);

                    }
                    else if(hm.get(arr[i])==2)
                    {
                        c2++;
                    }
                    else if(hm.get(arr[i])>2)
                    {
                        cx++;
                    }
                }
                if(c1==0)
                {
                    System.out.println("0");
                    
                }
                else if(c1>1)
                {
                    System.out.println((int)Math.ceil(c1/2.0));
                }
                else
                {
                    if(maxValue==unMax && cx>0)
                    {
                        System.out.println("2");
                    }
                    else
                    {
                        System.out.println("1");
                    }
                    
    
                } 
                    
            }
        }
        catch(Exception e) {}
    }
}