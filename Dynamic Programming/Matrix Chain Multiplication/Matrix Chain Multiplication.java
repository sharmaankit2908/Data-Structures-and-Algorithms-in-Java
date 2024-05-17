import java.util.* ;
import java.io.*; 

public class Solution {
	static int[][] dp;
	public static int helper(int[] arr , int N, int i, int j){
		if (i==j){
			return 0;
		}
		if (dp[i][j] !=-1){
			return dp[i][j];
		}
		int mini=Integer.MAX_VALUE;
		for (int k=i;k<j;k++){
			int temp=helper(arr, N, i, k)+helper(arr, N, k+1, j)+arr[i-1]*arr[k]*arr[j];
			mini=Math.min(temp, mini);
		}
		dp[i][j]=mini;
		return mini;
	}
	public static int matrixMultiplication(int[] arr , int N) {
		// Write your code here
		int n=N;
		dp=new int[n+1][n+1];
		for (int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				dp[i][j]=-1;
			}
		}
		return helper(arr, N, 1, n-1);

	}
}
