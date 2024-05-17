

public class Solution {

    private static String backtrack(int[][] dp, String a, String b) {
        String ans = "";
        int n = a.length(), m = b.length();

        // Bactracking by traversing from state dp[n][m] to dp[0][0].
        while(n > 0 && m > 0) {
            
            if(a.charAt(n - 1) == b.charAt(m - 1)) {
                ans += a.charAt(n - 1);
                n--;
                m--;
            }

            else if(dp[n-1][m] < dp[n][m-1]) {
                ans += a.charAt(n-1);
                n--;
            }
            
            else {
                ans += b.charAt(m-1);
                m--;
            }
        }

        while(n > 0) {
            ans += a.charAt(n-1);
            n--;
        }

        while(m > 0) {
            ans += b.charAt(m-1);
            m--;
        }

        // As we retrieved characters in reverse we need to reverse it before returning.
        String answer = "";
        for (int i = 0; i < ans.length(); i++) {
            answer = ans.charAt(i) + answer;
        }
        return answer;
    }

    public static String shortestSupersequence(String a, String b) {
        // Get lenghts of a and b in n and m.
        int n = a.length(), m = b.length();

        // Declare DP table and dpChar.
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the first column.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        // Initialize the first row.
        for (int i = 0; i <= m; i++) {
            dp[0][i] = i;
        }

        // Fill dp table with increasing order of rows and columns.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // If the last characters of prefixes are equal.
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        // Using the dp table backtrack the characters used in supersequence.
        return backtrack(dp, a, b);
    }
}
