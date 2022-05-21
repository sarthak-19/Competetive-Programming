import java.util.*;

public class B_Polycarp_Training
{

    // public static int upperBinarySearch(int ar[] , int key)
    // {
    //     int low = 0;
    //     int high = ar.length - 1;
    //     int mid = 0;
    //     while(low <= high)
    //     {
    //         mid = (low + high) / 2;
    //         if(ar[mid] == key)
    //             return ar[mid];
    //         else if(ar[mid] < key)
    //             low = mid + 1;
    //         else
    //             high = mid - 1;
    //     }
    //     if(mid >= ar.length-1)
    //         return ar[ar.length-1];
    //     else if(mid <= 0)
    //         return ar[0];
    //     else if(ar[mid] > key)
    //         return ar[mid];
    //     else if(ar[mid] < key)
    //         return ar[mid+1];
    //     return -1;
    // }

      public static int upperBinarySearch(int ar[] , int key)
    {
        int low = 0;
        int high = ar.length - 1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(ar[mid] == key)
                return ar[mid];
            if(ar[mid-1]<key && ar[mid]>key)
                return ar[mid];
            else if(ar[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        // if(mid >= ar.length-1)
        //     return ar[ar.length-1];
        // else if(mid <= 0)
        //     return ar[0];
        // else if(ar[mid] > key)
        //     return ar[mid];
        // else if(ar[mid] < key)
        //     return ar[mid+1];
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++)
            ar[i] = sc.nextInt();
        
        Arrays.sort(ar);

        int count = 0;
        for(int i=0; i<n; i++)
        {
            int element = upperBinarySearch(ar, i);
            if(i <= element)
                count++;
        }
        System.out.println(count);
        
                
        sc.close();
    }
}