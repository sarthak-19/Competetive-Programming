import java.util.*;
public class q1 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            String n=getPhoneNumber(s);
            System.out.println(n);
        }
    }

    public static String getPhoneNumber(String s) 
    {
        // String word[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("double", 10);
        map.put("triple", 11);
        String split[]=s.split(" ");
        String ans="";
        int l=split.length;
        for(int x=0;x<l-1;x++)
        {
            String w=split[x];
            int v=map.get(w);
            if(v==10)
            {
                String nw=split[x+1];
                String nv=Integer.toString(map.get(nw));
                ans+=nv+nv;
                x++;
            }
            else if(v==11)
            {
                String nw=split[x+1];
                String nv=Integer.toString(map.get(nw));
                ans+=nv+nv+nv;
                x++;
            }
            else
            {
                ans+=v;
            }
        }
        return ans;
    }
}
