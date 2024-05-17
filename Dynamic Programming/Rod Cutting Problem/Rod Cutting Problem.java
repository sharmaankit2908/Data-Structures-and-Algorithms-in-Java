public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int val[]=new int[n+1];
		val[0]=0;
		for (int i=1;i<=n;i++){
			int max_val=Integer.MIN_VALUE;
			for (int j=0;j<i;j++){
				max_val=Math.max(max_val, price[j]+val[i-1-j]);
			}
			val[i]=max_val;
		}
		return val[n];
	}
}