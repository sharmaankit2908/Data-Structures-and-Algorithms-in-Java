import java.util.* ;
import java.io.*; 
public class Solution {
    // Method to count the distinct ways to climb stairs
    public static long countDistinctWayToClimbStair(long nStairs) {
        // Check for base cases: 0 or 1 stair
        if (nStairs == 0 || nStairs == 1) {
            return 1; // There's only one way to climb 0 or 1 stair
        }

        // Define the modulo value to prevent overflow
        long MOD = 1000000007;

        // Create an array to store the number of ways to climb each step
        long[] dp = new long[(int) (nStairs) + 1];
        
        // Base cases: There's only one way to climb 0 or 1 stair
        dp[0] = 1;
        dp[1] = 1;
        
        // Fill the dp array using dynamic programming
        for (int i = 2; i <= nStairs; i++) {
            // Number of ways to climb step i is the sum of ways to climb steps (i-1) and (i-2)
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        // Return the number of ways to climb nStairs
        return dp[(int) nStairs];
    }
}


