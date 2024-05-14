public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int start=0;
        int end=a.length-1;
        int ans[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            if (a[i]<0){
                ans[start]=a[i];
                start++;
            }
            else {
                ans[end]=a[i];
                end--;
            }
        }
        return ans;
    }
}