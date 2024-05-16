import java.util.HashMap;

public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer, Integer> map=new HashMap<>();
		int count=0;
		for (int i=0;i<arr.length;i++){
			if (k !=0){
				int m1=(arr[i]+k);
				int m2=(arr[i]-k);
				if (map.containsKey(m1)){
					count +=map.get(m1);
				}
				if (map.containsKey(m2)){
					count +=map.get(m2);
				}
			}
			else {
				if (map.containsKey(arr[i])){
					count +=map.get(arr[i]);
				}
			}
			if (map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		return count;
	}
}