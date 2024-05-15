
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
		int n=s.length();
		if (n==0 || n==1){
			return s;
		}

		if (s.charAt(0)==s.charAt(1)){
			return s.substring(0,1)+"*"+addStars(s.substring(1));
		}
		else {
			return  s.substring(0,1)+addStars(s.substring(1));
		}

	}
}
