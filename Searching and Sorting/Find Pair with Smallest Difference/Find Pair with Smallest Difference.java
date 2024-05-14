public class Solution {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        int ans=Integer.MAX_VALUE;
        

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (Math.abs(arr1[i]- arr2[j]) < ans) {
                    ans=Math.abs(arr1[i]- arr2[j]);
                }
            }
        }
        return ans;
    }
}