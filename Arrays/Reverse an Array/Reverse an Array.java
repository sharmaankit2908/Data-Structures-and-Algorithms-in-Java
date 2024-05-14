public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int i=0;
        int j=nums.length-1;
        while (i <j){
            int c=nums[i];
            nums[i]=nums[j];
            nums[j]=c;
            i++;
            j--;
        }
        return nums;
    }
}
