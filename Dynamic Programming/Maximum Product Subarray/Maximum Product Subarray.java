import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		
		// Write your code here.
		// int max_so_far=arr.get(0);
		// int min_ending_here=arr.get(0);
		// int max_ending_here=arr.get(0);
		// for (int i=1;i<arr.size();i++){
		// 	int temp=Math.max(Math.max(arr.get(i), arr.get(i)*max_ending_here), arr.get(i)*min_ending_here);
		// 	min_ending_here=Math.min(Math.min(arr.get(i),arr.get(i)*max_ending_here), arr.get(i)*min_ending_here);
		// 	max_ending_here=temp;
		// 	max_so_far=Math.max(max_ending_here, max_so_far);
		// }
		// return max_so_far;



        int ans = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            ans = Math.max(ans, product);
            if (arr.get(i) == 0) {
                product = 1;
            }
        }
 
        product = 1;
 
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            product *= arr.get(i);
            ans = Math.max(ans, product);
            if (arr.get(i) == 0) {
                product = 1;
            }
        }
        return ans;
	}
}