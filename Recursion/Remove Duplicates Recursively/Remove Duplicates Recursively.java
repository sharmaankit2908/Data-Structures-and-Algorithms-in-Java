public class Solution {

	public static String removeConsecutiveDuplicates(String input,int s){
		if (s+1==input.length()){
			return "";
		}
		if (input.charAt(s)==input.charAt(s+1)){
			return  ("" +removeConsecutiveDuplicates(input,s+1));
		}
		else{
			return String.valueOf(input.charAt(s))+ removeConsecutiveDuplicates(input,s+1);
		}
	}

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		return removeConsecutiveDuplicates(s,0)+String.valueOf(s.charAt(s.length()-1));

	}

}