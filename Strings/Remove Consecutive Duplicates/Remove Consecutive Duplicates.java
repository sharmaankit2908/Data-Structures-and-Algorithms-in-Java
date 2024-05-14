public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		char ch=str.charAt(0);
		String ans=""+ch;
		int n=str.length()-1;
		for (int i=0;i<n;i++){
			if (str.charAt(i) != str.charAt(i+1)){
				char chr=str.charAt(i+1);
				ans +=chr;
			}
		}
		return ans;
	}

}