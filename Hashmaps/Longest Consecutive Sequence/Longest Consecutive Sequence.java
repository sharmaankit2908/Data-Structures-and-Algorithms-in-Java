
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		ArrayList<Integer> list=new ArrayList<>();

		ArrayList<Integer> ans=new ArrayList<>();

		if (arr.length==0){
			return ans;
		}

		if (arr.length==1){
			ans.add(arr[0]);
			return ans;
		}
		HashMap<Integer,Boolean> map=new HashMap<>();
		for (int i=0;i<arr.length;i++){
			map.put(arr[i], true);
			list.add(arr[i]);
		}
		
		
		int s=arr[0];
		int length=1;
		int e=arr[0];

		for (int i=0;i<arr.length;i++){
			int start=arr[i];
			int end=arr[i];
			int l=1;
			if (map.containsKey(start-1)){
				continue;
			}
			map.remove(start);
			while (map.containsKey(end+1)){
				end=end+1;
				l++;
				map.remove(end);
			}
			while (map.containsKey(start-1)){
				start=start-1;
				l++;
				map.remove(start);
			}
			if (l>length ){
				s=start;
				e=end;
				length=l;
			}
		}
		ans.add(s);
		if (length ==1){
			return ans;
		}
		ans.add(e);
		return ans;

		

    }
}