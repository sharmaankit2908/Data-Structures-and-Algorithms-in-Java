public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.
        while (l<r){
            int c=arr[l];
            arr[l]=arr[r];
            arr[r]=c;
            l++;
            r--;
        }
        return arr;
    }
}
