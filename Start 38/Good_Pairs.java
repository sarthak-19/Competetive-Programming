import java.util.*;
import java.lang.*;
import java.io.*;

class Good_Pairs
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0)
            {
                int n = sc.nextInt();
                // int b=sc.nextInt();
                // int m=sc.nextInt();

                int a[]=new int[n];
                int b[]=new int[n];
                HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                    if(!map.containsKey(a[i]))
                    {
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(i);
                        map.put(a[i],list);
                    }
                    else
                    {
                        ArrayList<Integer> list=map.get(a[i]);
                        list.add(i);
                    }
                }
                int c=0;
                for(int j=0;j<n;j++)
                {
                    b[j]=sc.nextInt();
                    if(j>0)
                    {
                        if(map.containsKey(b[j]))
                    {
                        ArrayList<Integer> list=map.get(b[j]);
                        for(int k=0;k<list.size();k++)
                        {
                            int index=list.get(k);
                            if(index<j)
                            {
                                if(a[index]==b[j] && b[index]==a[j])
                                {
                                    c++;
                                    // list.remove(j);
                                }
                            }

                        }
                    }
                    }
                    
                }
                System.out.println(c);
        }
        }
        catch(Exception e) {}
    }
}