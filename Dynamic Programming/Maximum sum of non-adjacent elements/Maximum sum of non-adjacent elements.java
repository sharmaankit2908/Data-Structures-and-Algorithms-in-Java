import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int helper(ArrayList<Integer> nums,ArrayList<Integer> ans){
		int n=nums.size();
		if (n==1){
			return ans.get(ans.size()-1);
		}
		int k=3;
		ans.add(Math.max(nums.get(0), nums.get(1)));
		while (k<=n){
			if ((nums.get(k-1)+ans.get(k-2)) >= (ans.get(k-1))){
				ans.add((nums.get(k-1)+ans.get(k-2)));
			}
			else{
				ans.add((ans.get(k-1)));
			}
			k++;
		}
		return ans.get(ans.size()-1);
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n=nums.size();
		ArrayList<Integer> ans=new ArrayList<>();
		ans.add(0);
		ans.add(nums.get(0));
		
		return helper(nums,ans);
	}
}