
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2, int s){
		if (s==input.length()){
			return "";
		}
		if (input.charAt(s)==c1){
			return String.valueOf(c2) +replaceCharacter(input,c1,c2,s+1);
		}
		else{
			return String.valueOf(input.charAt(s))+replaceCharacter(input,c1,c2,s+1);
		}
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		return replaceCharacter(input,c1,c2,0);



	}
}
