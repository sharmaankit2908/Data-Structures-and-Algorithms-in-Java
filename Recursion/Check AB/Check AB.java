public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
		int n=input.length();
		if (n==0){
			return true;
		}
		else if (n==1){
			if (input.charAt(0)=='a'){
				return true;
			}
			else {
				return false;
			}
		}
		else if (n==2){
			if (input.charAt(0)=='a' && input.charAt(1)=='a'){
				return true;
			}
			else {
				return false;
			}
		}
		else if (n==3){
			if (input.charAt(0)=='a'){
				String m="bb";
				String p="aa";
				if (((input.substring(1,3)).equals(m)) || ((input.substring(1,3)).equals(p))){
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		// else if (n==4){
		// 	if (input.charAt(0)=='a'){
		// 		String m="bb";
		// 		String p="a";
		// 		if (((input.substring(1,3)).equals(m))){
		// 			if ((input.charAt(3))=='a'){
		// 				return true;
		// 			}
		// 			else {
		// 				return false;
		// 			}
		// 		}
		// 		else if (input.charAt(1)=='a'){
		// 			if ((input.substring(2,4)).equals("bb") || (input.substring(2,4)).equals("aa")){
		// 				return true;
		// 			}
		// 			else {
		// 				return false;
		// 			}
		// 		}
		// 		else {
		// 			return false;
		// 		}
		// 	}
		// 	else {
		// 		return false;
		// 	}
		// }
		boolean b=checkAB(input.substring(0,2));
		boolean d=checkAB(input.substring(2));
		return (b&&d);
	}
}
