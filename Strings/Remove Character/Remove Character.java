public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		int n=str.length();
		char ch1[]=new char[n];
		for (int i=0;i<n;i++){
			ch1[i]=str.charAt(i);
		}
		String ans="";
		for (int i=0;i<n;i++){
			if (ch1[i] !=ch){
				ans +=ch1[i];
			}
		}
		return ans;
	}

}