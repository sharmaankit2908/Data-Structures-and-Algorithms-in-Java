import java.util.* ;
import java.io.*; 
public class Solution {
	static int[][]dp;
	public static int helper(String s, String t, int index1, int index2){
		if (index1<0 || index2<0){
			return 0;
		}
		if (dp[index1][index2] !=-1){
			return dp[index1][index2];
		}
		int ans;
		if (s.charAt(index1)==t.charAt(index2)){
			ans=1+helper(s, t, index1-1, index2-1);
		}
		else{
			ans=Math.max(helper(s, t, index1-1, index2), helper(s, t, index1, index2-1));
		}
		dp[index1][index2]=ans;
		return ans;
	}
	public static int longestPalindromeSubsequence(String s) {
		// Write your code here.
		String t="";
		int n=s.length();
		for (int i=0;i<n;i++){
			t +=s.charAt(n-1-i);
		}
		dp=new int[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				dp[i][j]=-1;
			}
		}
		return helper(s, t, n-1,n-1);

	}
}