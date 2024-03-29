import java.util.*;

public class MinimumPart {

    public static int minPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // W=sum/2
        int w = sum / 2;

        int dp[][] = new int[n + 1][w + 1];

        // initialization(skipping here, but it is necessary in other languages)

        // botton-up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (arr[i - 1] <= j) {// valid
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = dp[n][w];
        int sum2 = sum - sum1;
        int ans = Math.abs(sum1 - sum2);

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 6, 11, 5 };

        System.out.println(minPartition(nums));
    }
}
