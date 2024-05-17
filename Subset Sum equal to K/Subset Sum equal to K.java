import java.util.* ;
import java.io.*; 
public class Solution {

    // public static boolean subsetSumToK_helper_memoization(int n, int k, int arr[], int index,int[][] dp){
    //     if (k==0){
    //         return true;
    //     }
    //     if (index==n){
    //         return false;
    //     }
    //     if (dp[index][k] !=0){
    //         return (dp[index][k]==1?true:false);
    //     }
    //     boolean b1=false;
    //     if ((k-arr[index])>=0){
    //         b1=subsetSumToK_helper_memoization(n, k-arr[index], arr, index+1,dp);
    //     }
    //     boolean b2=subsetSumToK_helper_memoization(n, k, arr, index+1,dp);
    //     boolean temp= b1||b2;
    //     dp[index][k]=(temp==true?1:2);
    //     return temp;
    // }
    public static boolean subsetSumToK_helper_tabulation(int n, int k, int arr[],boolean[][] dp){

        for (int i=0;i<=n;i++){
            dp[i][0]=true;
           
        }
        for (int j=1;j<=k;j++){
            dp[0][j]=false;
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=k;j++){
                boolean take=false;
                boolean not_take=dp[i-1][j];
                if (j>=arr[i-1]){
                    take=dp[i-1][j-arr[i-1]];
                }
                dp[i][j]=take||not_take;
            }
        }
        return dp[n][k];
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        boolean[][] dp=new boolean[n+1][k+1];
        // return subsetSumToK_helper_memoization(n, k, arr,0,dp);
        return subsetSumToK_helper_tabulation(n, k, arr, dp);
    }
}
