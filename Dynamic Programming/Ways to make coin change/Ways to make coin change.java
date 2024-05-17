
public class Solution {

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here	
		int n=denominations.length;
		long[][] dp=new long[n+1][value+1];
		for(int i=0;i<=n;i++){
			dp[i][0]=1;
		}
		for (int j=1;j<=value;j++){
			dp[0][j]=0;
		}
		for (int i=1;i<=n;i++){
			for(int j=1;j<=value;j++){
				long take=0;
				long not_take=dp[i-1][j];
				if ((j-denominations[i-1])>=0){
					take=dp[i][j-denominations[i-1]];
				}
				dp[i][j]=take+not_take;
			}
		}
		return dp[n][value];
	}
	
}
