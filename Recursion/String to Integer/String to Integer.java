public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
		int n=input.length();
		if (n==0){
			return 0;
		}
		if (n==1){
			int n1=input.charAt(0)-'0';
			return n1;
		}
		return (convertStringToInt(input.substring(0,n-1))*10)+convertStringToInt(input.substring(n-1));


	}
