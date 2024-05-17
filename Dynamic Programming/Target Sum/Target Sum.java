import java.util.* ;
import java.io.*; 
public class Solution {
    // static int count=0;
    public static void targetSum_heleper(int n, int target, int[] arr, int index,int sum,int[] count) {
    	// Write your code here.
        if (index==n){
            if (sum==target){
                count[0] +=1;
            }
            return;
        }
        targetSum_heleper(n, target, arr, index+1, sum+arr[index],count);
        targetSum_heleper(n, target, arr, index+1, sum-arr[index],count);

    }
    public static int targetSum(int n, int target, int[] arr) {
    	// Write your code here.
        int count[]=new int[1];
        count[0]=0;
        targetSum_heleper(n, target, arr, 0, 0,count);
        return count[0];
    }
}