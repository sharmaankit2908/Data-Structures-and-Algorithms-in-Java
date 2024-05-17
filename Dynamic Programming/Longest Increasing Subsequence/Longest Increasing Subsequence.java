import java.util.ArrayList;

public class Solution {
	public static int find_greater_index(ArrayList<Integer> ans, int number, int start_index,int end_index){

		if (start_index>end_index){
			return start_index;
		}
		int mid=(start_index+end_index)/2;

		if (ans.get(mid) >number){
			return find_greater_index(ans, number, start_index, mid-1);
		}
		else if (ans.get(mid) <number){
			return find_greater_index(ans, number, mid+1, end_index);
		}
		else{
			return mid;
		}
	}

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
		ArrayList<Integer> ans=new ArrayList<>();
		int last_index=0;
		ans.add(arr[0]);
		int n=arr.length;
		for (int i=1;i<n;i++){			
			if (arr[i]>ans.get(last_index)){
				ans.add(arr[i]);
				last_index++;
			}
			else{
				int index=find_greater_index(ans,arr[i],0,last_index);
				ans.set(index, arr[i]);
			}
		}
		return ans.size();
	}

}