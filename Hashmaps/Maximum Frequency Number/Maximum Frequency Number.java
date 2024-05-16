import java.util.HashMap;
import java.util.*; 

public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i=0;i<arr.length;i++){
			int key=arr[i];
			if (map.containsKey(key)){
				int n=map.get(key);
				map.replace(key,n,n+1);
			}
			else{
				map.put(key,1);
				list.add(arr[i]);
			}
			
		}
		int max=-1;
		int ans=-1;
		 
		for (Integer i:list){
			if (map.get(i) >max){
				max=map.get(i);
				ans=i;
			}
		}
		return ans;
    }
}

