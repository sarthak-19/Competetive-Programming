import java.util.*;
class Monks
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
                int A[] = new int[n];
                int sum = 0;
                for(int x=0; x<n; x++)
                {
                    A[x] = sc.nextInt();
                    sum = sum + A[x];
                }
                Arrays.sort(A);

                if(n*A[n-1] - sum == 0)
                    System.out.println(0);
                else
                {
                    int i = n-1;
                    int rightSum = A[i];
                    while(i>=0 && rightSum < ((i*A[i]) - (sum - rightSum)))
                    {
                        i--;
                        rightSum = rightSum + A[i];
                    }
                    System.out.println(n-i);
                }                
            }
            sc.close();
        }
        catch(Exception e) {}
    }
}