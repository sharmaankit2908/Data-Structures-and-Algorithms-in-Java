import java.util.*;

public class Solution {
    public static int minimumElements_helper(int num[], int k, int n, int[][] dp){
       
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // If the target sum is 0, no elements are needed
        }
        for (int i = 1; i <= k; i++) {
            dp[0][i] = -1; // If no elements are taken and target sum is non-zero, it's not possible, so mark it as -1
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j - num[i - 1] < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    int withoutTakingCurrent = dp[i - 1][j];
                    int takingCurrent = dp[i][j - num[i - 1]];
                    // Handle cases when it's not possible to reach the target sum
                    if (takingCurrent == -1 && withoutTakingCurrent == -1) {
                        dp[i][j] = -1;
                    } else if (takingCurrent == -1) {
                        dp[i][j] = withoutTakingCurrent;
                    } else if (withoutTakingCurrent == -1) {
                        dp[i][j] = 1 + takingCurrent;
                    } else {
                        dp[i][j] = Math.min(withoutTakingCurrent, 1 + takingCurrent);
                    }
                }
            }
        }
        return dp[n][k];
    }

    public static int minimumElements(int num[], int x) {
        int n = num.length;
        int[][] dp = new int[n + 1][x + 1];
        return minimumElements_helper(num, x, n, dp);
    }
}
