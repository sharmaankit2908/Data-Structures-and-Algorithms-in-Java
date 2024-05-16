
import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int count=0;
		for (int i=0;i<size;i++){
			int negative=-input[i];
			if (map.containsKey(negative)){
				count +=map.get(negative);
			}
			if (map.containsKey(input[i])){
				map.put(input[i], map.get(input[i])+1);
			}
			else{
				map.put(input[i],1);
			}
		}
		return count;
	}
}