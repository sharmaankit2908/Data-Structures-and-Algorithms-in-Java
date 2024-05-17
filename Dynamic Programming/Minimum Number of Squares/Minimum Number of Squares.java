public class Solution {
    public static int getMinSquares(int n) { 
        //Input and output has already been taken for you
	// Write code here 
        int[] dp=new int[n+1];
        if (n<4){
            return n;
        }
        for (int i=0;i<4;i++){
            dp[i]=i;
        }
        for (int i=4;i<=n;i++){
            dp[i]=n;
            for (int j=1;i-j*j>=0;j++){
                int temp=j*j;
                dp[i]=Math.min(dp[i],1+dp[i-temp]);
            }
        }
        return dp[n];
    } 
}