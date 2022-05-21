//Subsequence Mex
// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    
    class IntArray
    {
        public static int[] input(BufferedReader br, int n) throws IOException
        {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            
            return a;
        }
        
        public static void print(int[] a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
        
        public static void print(ArrayList<Integer> a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                int N; 
                N = Integer.parseInt(br.readLine());
                
                
                int[] A = IntArray.input(br, N);
                
                Solution obj = new Solution();
                int res = obj.solve(N, A);
                
                System.out.println(res);
                
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
        public int solve(int N, int[] A) 
        {
            //Arrays.sort(A);
            HashSet<Integer> hs=new HashSet<>();
            for(int x=0;x<N;x++)
            {
                hs.add(A[x]);
            }
            // int i=0;
            for(int x=0;x<N;x++)
            {
                if(hs.contains(x)==false)
                {
                    return x;
                }
            }
            return N;
        }
    }
            
    