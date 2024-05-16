import java.util.ArrayList;

public class solution {

	public static ArrayList subsequenc(String input){
		// Write your code here

		ArrayList<String> ans=new ArrayList<>();
		if (input.isEmpty()){
			return ans;
		}
		String a1=""+input.charAt(0);

		ArrayList<String> a2=subsequenc(input.substring(1));
		ans.add(a1);

		for (int i=0;i<a2.size();i++){
			ans.add(a2.get(i));
		}
		// ans.add(input.substring(1));
		for(int i=0;i<a2.size();i++){
			String a3=a1+(a2.get(i));
			ans.add(a3);
		}
		return ans;
	}

	// Return the subsequences saved in a string array
	public static String[] subsequence(String input){
		// Write your code here
		ArrayList<String> an=subsequenc(input);
		String[] final_ans=new String[an.size()];
		for (int i=0;i<an.size();i++){
			final_ans[i]=an.get(i);
		}
		return final_ans;
	}
}
