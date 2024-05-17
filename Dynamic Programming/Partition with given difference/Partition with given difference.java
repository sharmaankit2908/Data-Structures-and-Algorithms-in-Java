import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countPartitions_helper(int[] arr,int k,int n, int[][] dp){
		for (int i=0;i<=k;i++){
			dp[0][i]=0;
		}
		dp[0][0]=1;
		for (int i=1;i<=n;i++){
			for (int j=0;j<=k;j++){
				int take=0;
				int not_take=dp[i-1][j];
				if ((j-arr[i-1])>=0){
					take=dp[i-1][j-arr[i-1]];
				}
				dp[i][j]=(take+not_take)%1000000007;
			}
		}
		return dp[n][k];
	}
	public static int countPartitions(int n, int d, int[] arr) {
		// Write your code here.
		int sum=0;
		// int n=arr.length;
		
		for (int i=0;i<n;i++){
			sum+=arr[i];
		}
		if ((d+sum)%2 !=0){
			return 0;
		}
		int tar=(d+sum)/2;
		int[][] dp=new int[n+1][tar+1];
		return countPartitions_helper(arr, tar, n,dp);
	}
}