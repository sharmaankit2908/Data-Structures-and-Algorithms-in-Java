import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		int b[][]=new int[n][m];
		for (int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				b[j][i]=mat[i][j];
			}
		}
		return b;
	}

}