import java.util.* ;
import java.io.*; 

public class Solution {
	public static int getMaxPathSum(int[][] matrix) {
		// Write your code here
		int n=matrix.length;
		int m=matrix[0].length;
		int ans[][]=new int[n][m];
		for (int j=0;j<m;j++){
			ans[0][j]=matrix[0][j];
		}
		int mod=1000000007;
		
		for (int i=1;i<n;i++){
			for (int j=0;j<m;j++){
				int a=Integer.MIN_VALUE;
				int b=Integer.MIN_VALUE;
				int c=Integer.MIN_VALUE;
				if ((j-1)>=0){
					a=ans[i-1][j-1];
				}
				b=Math.max(a,ans[i-1][j]);
				if (j+1<m){
					c=ans[i-1][j+1];
				}
				ans[i][j]=(matrix[i][j]+Math.max(b,c))%mod;
			}
		}

		int max=Integer.MIN_VALUE;
		for (int j=0;j<m;j++){
			if (ans[n-1][j]>max){
				max=ans[n-1][j];
			}
		}
		return max;
	}
}
