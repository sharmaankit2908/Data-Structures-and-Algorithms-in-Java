import java.util.*;
import java.io.*;

public class Solution {

     public static int findWays_helper(int arr[],int k, int n, int[][] dp){
        dp[0][0]=1;
        for (int j=1;j<=k;j++){
            dp[0][j]=0;
        }

        for (int i=1;i<=n;i++){
            for (int j=0;j<=k;j++){
                if (arr[i - 1] > j){
                    dp[i][j] = dp[i - 1][j];
                }
                else{
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - arr[i - 1]])%1000000007;
                }
            }
        }
        return dp[n][k];
    }


    public static int findWays(int num[], int tar) {
        // Write your code here.
        int n=num.length;
        int[][] dp=new int[n+1][tar+1];
        return findWays_helper(num, tar,n,dp);

    }
}