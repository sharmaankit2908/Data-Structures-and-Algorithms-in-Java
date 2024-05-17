
public class Solution {
	public static int lcs_helper(String s, String t,int index1,int index2,int[][] dp){
		if (index1<0 || index2<0){
			return 0;
		}
		if (dp[index1][index2] !=-1){
			return dp[index1][index2];
		}
		int temp;
		if (s.charAt(index1)==t.charAt(index2)){
			temp= 1+lcs_helper(s, t, index1-1, index2-1,dp);
		}
		else{
			temp= Math.max(lcs_helper(s, t, index1-1, index2,dp), lcs_helper(s, t, index1, index2-1,dp));
		}
		dp[index1][index2]=temp;
		return temp;
	} 

	public static int lcs(String s, String t) {
		//Your code goes here
		int n1=s.length();
		int n2=t.length();
		int dp[][]=new int[n1][n2];
		for (int i=0;i<n1;i++){
			for (int j=0;j<n2;j++){
				dp[i][j]=-1;
			}
		}
		return lcs_helper(s, t, n1-1, n2-1,dp);
    }

}