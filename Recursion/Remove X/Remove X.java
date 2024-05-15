
public class solution {
	public static String replaceCharacter(String input, char c1, int s){
		if (s==input.length()){
			return "";
		}
		if (input.charAt(s)==c1){
			return replaceCharacter(input,c1,s+1);
		}
		else{
			return String.valueOf(input.charAt(s))+replaceCharacter(input,c1,s+1);
		}
	}

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
		return replaceCharacter(input,'x',0);

	}
}