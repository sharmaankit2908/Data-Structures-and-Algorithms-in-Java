public class Solution {  

    public static void prefixSum(int[] arr) {
        
        //Write your code here
        for (int i=1;i<arr.length;i++){
            arr[i] +=arr[i-1];
        }
    }
}