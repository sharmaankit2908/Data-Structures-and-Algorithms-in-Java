public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		boolean Palindrome=true;
		int n=str.length();
		for (int i=0;i<n;i++){
			if (str.charAt(i) != str.charAt(n-i-1)){
				Palindrome=false;
				break;

			}
		}
		return Palindrome;
	}

}