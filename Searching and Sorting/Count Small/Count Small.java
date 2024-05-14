public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        int ans[]=new int[n];
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<m;j++){
                if (a[i] >= b[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}