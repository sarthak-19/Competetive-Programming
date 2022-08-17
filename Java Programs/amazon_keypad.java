import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'minimumKeypadClickCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING text as parameter.
     */

    public static int minimumKeypadClickCount(String text) 
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        char chc='a';
        for(char x=1;x<=26;x++)
        {
            hm.put(chc, -1);
            chc++;
        }
        int unq=1;
        for(int x=0;x<text.length();x++)
        {
            char ch=text.charAt(x);
            if(unq<=9)
            {
                if(hm.get(ch)==-1)
                {
                    unq++;
                    hm.put(ch, 1);
                }
            }
            else if(unq<=18)
            {
                if(hm.get(ch)==-1)
                {
                    unq++;
                    hm.put(ch, 2);
                }
            }
            else
            {
                if(hm.get(ch)==-1)
                {
                    unq++;
                    hm.put(ch, 3);
                }
            }
        }
        int c=0;
        for(int x=0;x<text.length();x++)
        {
            c+=hm.get(text.charAt(x));   
        }
        return c;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        int result = Result.minimumKeypadClickCount(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
