import java.util.*;

public class KatalanNum {

    public static int katalanRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += katalanRec(i) * katalanRec(n - i - 1);
        }
        return ans;
    }

    public static int katalanMemo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += katalanMemo(i, dp) * katalanMemo(n - i - 1, dp);
        }
        dp[n] = ans;
        return dp[n];
    }

    public static int katalanTab(int n) {
        // table
        int dp[] = new int[n + 1];

        // initialization
        dp[0] = 1;
        dp[1] = 1;

        // bottom up
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        /*
         * // System.out.println(katalanRec(n));
         * 
         * int dp[] = new int[n + 1];
         * for (int i = 2; i < n + 1; i++) {
         * dp[i] = -1;
         * }
         * System.out.println(katalanMemo(n, dp));
         */
        System.out.println(katalanTab(n));
    }

}
