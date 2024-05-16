import java.util.HashMap;

public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int ans=0;
		map.put(0,-1);
		for (int i=0;i<arr.length;i++){
			sum +=arr[i];
			if (map.containsKey(sum)){
				int diff=i-map.get(sum);
				if (diff>ans){
					ans=diff;
				}
			}
			else{
				map.put(sum,i);
			}
		}
		// if (sum==0){
		// 	return arr.length;
		// }
		return ans;

	}
}