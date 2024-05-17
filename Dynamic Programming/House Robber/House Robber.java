import java.util.* ;
import java.io.*; 
import java.lang.*;
public class Solution {

	public static long helper1(int[] nums,ArrayList<Long> ans){
		ans.add(0L);
		long c=nums[0];
		ans.add(c);
		int n=nums.length;
		if (n==1){
			return ans.get(ans.size()-1);
		}
		int k=3;
		long m1=Math.max(nums[0],nums[1]);
		ans.add(m1);

		while (k<n){
			long a=nums[k-1]+ans.get(k-2);
			long b=ans.get(k-1);
			if (a>b){
				ans.add(a);
			}
			else{
				ans.add(b);
			}
			k++;
		}
		return ans.get(ans.size()-1);
	}
	public static long helper2(int[] nums,ArrayList<Long> ans){
		ans.add(0L);
		long c=nums[1];
		ans.add(c);
		int n=nums.length;
		if (n==2){
			return ans.get(ans.size()-1);
		}
		int k=4;
		long m1=Math.max(nums[1],nums[2]);
		ans.add(m1);

		while (k<=n){
			long a=nums[k-1]+ans.get(k-3);
			long b=ans.get(k-2);

			if (a>b){
				ans.add(a);
			}
			else{
				ans.add(b);
			}
			k++;
		}
		return ans.get(ans.size()-1);
	}
	public static long houseRobber(int[] valueInHouse) {
		// Write your code here.
		int n=valueInHouse.length;
		ArrayList<Long> ans=new ArrayList<>();
		
		
		long ans1= helper1(valueInHouse,ans);	
		ans=new ArrayList<>();	
		long ans2=0;
		if (n>1){
			ans2=helper2(valueInHouse, ans);
		}
		
		return Math.max(ans1,ans2);

	}	
}