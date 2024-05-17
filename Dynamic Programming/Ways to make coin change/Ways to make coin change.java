
public class Solution {
	static long dp[][];
	public static long helper(int denominations[], int value, int index,int n){
		if (dp[index][value] !=-1){
			return dp[index][value];
		}
		if (value==0){
			return 1;
		}
		if (index==n){
			return 0;
		}
		long take=0;
		if ((value-denominations[index]) >=0){
			take=helper(denominations, value-denominations[index], index, n);
		}
		long not_take=helper(denominations, value, index+1, n);
		long ans=take+not_take;
		
		dp[index][value]=ans;
		return ans;

	}

        //write your code here	

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here		
		int n=denominations.length;
		dp=new long[n][value+1];
		for (int i=0;i<n;i++){
			for (int j=0;j<=value;j++){
				dp[i][j]=-1;
			}
		}
		return helper(denominations, value, 0,n);	

	}
	
}