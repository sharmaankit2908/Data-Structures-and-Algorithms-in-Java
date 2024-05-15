public class solution {
	public static int factorialUsingForLoop(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static String[] permutationOfString(String input){
		// Write your code here
		if (input.length()==0){
			return new String[0];
		}
		String final_ans[]=new String[factorialUsingForLoop(input.length())];

		if (input.length()==1){
			String s[]=new String[1];
			s[0]=input;
			return s;
		}
		String ans[]=permutationOfString(input.substring(1));
		int k=0;
		for (int i=0;i<ans.length;i++){
			final_ans[k++]=input.charAt(0)+ans[i];
			for (int j=1;j<ans[i].length();j++){
				final_ans[k++]=ans[i].substring(0,j)+input.charAt(0)+ans[i].substring(j);
			}
			final_ans[k++]=ans[i]+input.charAt(0);
		}
		return final_ans;

		
	}
	
}