import java.util.* ;
import java.io.*; 

public class Solution{

    public static int knapsack_helper_tabulation(int[] weight, int[] value, int n, int maxWeight,int[][] dp) {
        for (int i=0;i<=n;i++){
            for (int j=0;j<=maxWeight;j++){
                dp[i][j]=0;
            }
        }
        for (int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for (int j=0;j<=maxWeight;j++){
            dp[0][maxWeight]=0;
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=maxWeight;j++){
                int take=Integer.MIN_VALUE;
                int not_take;

                not_take=dp[i-1][j];
                if (weight[i-1] <=j){
                    take=value[i-1]+dp[i-1][j-weight[i-1]];
                }
                dp[i][j]=Math.max(take, not_take);  
            }
        }
        return dp[n][maxWeight];

    }


    public static int knapsack_helper_memoization(int[] weight, int[] value, int index, int maxWeight,int[][] dp) {

        if (index==weight.length){
            return 0;
        }
        if (dp[index][maxWeight] !=-1){
            return dp[index][maxWeight];
        }

        int take=Integer.MIN_VALUE;
        if ( (maxWeight-weight[index]) >=0){
            take=knapsack_helper_memoization(weight, value, index+1, maxWeight-weight[index],dp)+value[index];
        }
        int not_take=knapsack_helper_memoization(weight, value, index+1, maxWeight,dp);

        int temp=Math.max(take, not_take);
        dp[index][maxWeight]=temp;
        return temp;
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */
   
            int[][] dp=new int[n+1][maxWeight+1];
            for (int i=0;i<=n;i++){
                for (int j=0;j<=maxWeight;j++){
                    dp[i][j]=-1;
                }
            }
            // return knapsack_helper_memoization(weight, value, 0, maxWeight,dp);
            return knapsack_helper_tabulation(weight, value, n, maxWeight, dp);
            
    }
}