
import java.util.HashMap;

public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i=0;i<arr1.length;i++){
			int key=arr1[i];
			map.put(key,map.containsKey(key) ? map.get(key)+1:1);
		}
		for (Integer i:arr2){
			if ((map.containsKey(i)) && (map.get(i)>0)){
				System.out.println(i+ " ");
				map.put(i,map.get(i)-1);
			}
		}

	}
}