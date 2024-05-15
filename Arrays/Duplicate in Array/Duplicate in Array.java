public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
		int ans1=0;
		int ans2=0;
		for (int i=0;i<arr.length;i++){
			ans2 += arr[i];
			ans1 +=i;
		}
		return (arr.length-1-(ans1-ans2));
	}
}