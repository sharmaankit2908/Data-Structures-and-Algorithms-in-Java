public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
		int n=input.length();
		String s[]=input.split(" ");
		String ans=s[0];
		int min_length=s[0].length();

		for (int i=1;i<s.length;i++){
			if ((s[i].length())<min_length){
				ans=s[i];
				min_length=s[i].length();
			}
		}
		return ans;
	}
}