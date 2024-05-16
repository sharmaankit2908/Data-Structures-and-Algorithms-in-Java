public class solution {
	public static void permutations_helper(String input,String s){
		if (input.isEmpty()){
			System.out.println(s);
			return;
		}
		for (int i=0;i<s.length();i++){
			permutations_helper(input.substring(1), s.substring(0,i)+input.charAt(0)+s.substring(i));
		}
	}

	public static void permutations(String input){
		// Write your code here
		permutations_helper(input, " ");

	}
}
