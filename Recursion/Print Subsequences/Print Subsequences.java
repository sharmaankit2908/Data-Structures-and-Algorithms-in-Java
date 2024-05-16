import java.util.ArrayList;

public class solution {
	public static void printSubsequences_helper(String input,String so_far) {
		// Write your code here
		if (input.isEmpty()){
			System.out.println(so_far);
			return;
		}
		printSubsequences_helper(input.substring(1),so_far);
		printSubsequences_helper(input.substring(1), so_far+input.charAt(0));
	}

	public static void printSubsequences(String input) {
		// Write your code here
		printSubsequences_helper(input,"");

	}
}
