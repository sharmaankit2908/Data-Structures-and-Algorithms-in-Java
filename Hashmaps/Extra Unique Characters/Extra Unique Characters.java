import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		HashMap<Character,Integer> map=new HashMap<>();
		String ans="";
		for (int i=0;i<str.length();i++){
			if (map.containsKey(str.charAt(i))){
				continue;
			}
			else{
				map.put(str.charAt(i), 1);
				ans +=str.charAt(i);
			}
		}
		return ans;

	}
}