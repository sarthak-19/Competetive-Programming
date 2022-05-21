import java.util.Scanner;

public class Average_Gift {

  static int N = 100;
  static int X = 100;

  public static boolean canGift(int S[], int n, int x) {
    if (n < 0) return (x == 0);
    return canGift(S, n - 1, x) || canGift(S, n - 1, x - S[n]);
  }

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();
        int X = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) S[i] = sc.nextInt();
        if (canGift(S, n - 1, X)) System.out.println("YES"
        ); else System.out.println("NO");
      }
    }
  }
}
