import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Solution {
//    public static boolean subsetSumToK_helper(int n, int k, int arr[],HashMap<Integer, Integer> map){
//         if (n==0){
//             return true;
//         }
//         if (n==1){
//             return k==arr[0];
//         }
//         map.put(0,0);
        
//         map.put(1,arr[0]);
//         int n1=2;
//         for (int i=1;i<n;i++){
//             int m=map.size();
            
//             for (int j=0;j<m;j++){
//                 int c=(arr[i]+map.get(j))%1000000007;
//                 if (c>k || arr[i]>k){
//                     continue;
//                 }
//                 if (c==k){
//                     return true;
//                 }
//                 if (!map.containsValue(c)){
//                     map.put(n1++,c);
//                 }
//             }
//         }
//         return false;
//     }

    // public static boolean canPartition_memoization(int n, int k, int arr[],int index,int[][] dp){
    //     if (k==0){
    //         return true;
    //     }
    //     if (index==n){
    //         return false;
    //     }
    //     if (dp[index][k] !=0){
    //         return (dp[index][k]==1?true:false);
    //     }
    //     boolean take=false;
    //     boolean not_take=canPartition_memoization(n, k, arr, index+1,dp);
    //     if (k-arr[index] >=0){
    //         take=canPartition_memoization(n, k-arr[index], arr, index+1,dp);
    //     }
    //     boolean temp=take||not_take;
    //     dp[index][k]=(temp==true?1:2);
    //     return temp;
    // }
    public static boolean canPartition_tabulation(int n, int k, int arr[],boolean[][] dp){
        for (int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for (int j=0;j<=k;j++){
            dp[0][k]=false;
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=k;j++){
                boolean not_take=dp[i-1][j];
                boolean take=false;
                if ((j-arr[i-1])>=0){
                    take=dp[i-1][j-arr[i-1]];
                }
                dp[i][j]=take||not_take;
            }
        }
        return dp[n][k];

    }



	public static boolean canPartition(int[] arr, int n) {
		// Write your code here.
		int sum=0;
		for (int i=0;i<n;i++){
			sum +=arr[i];
		}
	
		if (sum %2 !=0){
			return false;
		}
		int k=sum/2;
        // int[][] dp=new int[n+1][k+1];
        
		// HashMap<Integer,Integer> map=new HashMap<>();
		// return subsetSumToK_helper(n, k, arr, map);
        // return canPartition_memoization(n, k, arr, 0,dp);
        boolean[][] dp=new boolean[n+1][k+1];
        return canPartition_tabulation(n, k, arr, dp);
	}
}