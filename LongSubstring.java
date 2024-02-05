import java.util.*;

public class LongSubstring {

    public static int longestCommonSubstring(String str1, String str2) {
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        int max = 0;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    // comparision for maximum length
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        /*
         * int max = 0;
         * for (int i = 1; i < dp.length; i++) {
         * for (int j = 1; j < dp[0].length; j++) {
         * if (dp[i][j] > max) {
         * max = dp[i][j];
         * }
         * }
         * }
         */

        return max;
    }

    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";

        System.out.println(longestCommonSubstring(str1, str2));
    }

}
