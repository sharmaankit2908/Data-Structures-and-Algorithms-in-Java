public class solution {

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
		if (input.length()==0){
			String ans[]=new String[1];
			ans[0]="";
			return ans;
		}
		int n1=input.charAt(0)-'0';
		char c1=(char)('a'+n1-1);
		char c2=' ';
		int n2=0;
		if(input.length()>=2)
		{
			n2=n1*10+input.charAt(1)-'0';
			 c2=(char)('a'+n2-1);
		}
		String []ans1=getCode(input.substring(1));//
		String []ans2=new String[0];
		if(n2>=10 && n2<=26)
		{
          ans2=getCode(input.substring(2));//
		}

	
		String final_ans[]=new String[ans1.length+ans2.length];
		int k=0;
		for (int i=0;i<ans1.length;i++){
			final_ans[k++]=c1+ans1[i];
		}
		for (int i=0;i<ans2.length;i++){
			final_ans[k++]=c2+ans2[i];
		}
		return final_ans;
	}


}


// public class solution {

// 	// Return a string array that contains all possible codes
// 	public static  String[] getCode(String input){
// 		// Write your code here
// 		if (input.length()==0){
// 			String[] ans=new String[1];
// 			ans[0]=" ";
// 			return ans;
// 		}
// 		int n1=input.charAt(0)-'0';
// 		char ch1=(char)('a'+n1-1);
// 		char ch2=' ';
// 		int n2=0;
// 		if (input.length()>=2){
// 			n2=n1*10+input.charAt(1)-'0';
// 			ch2=(char)(n2+'a'-1);
// 		}
// 		String[] ans1=getCode(input.substring(1));
// 		String[] ans2=new String[0];
// 		if (n2>9 && n2<27){
// 			ans2=getCode(input.substring(2));
// 		}

// 		String[] final_ans=new String[ans1.length+ans2.length];
// 		int k=0;
// 		for (int i=0;i<ans1.length;i++){
// 			final_ans[k++]=ch1+ans1[i];
// 		}
// 		for (int i=0;i<ans2.length;i++){
// 			final_ans[k++]=ch2+ans2[i];
// 		}
// 		return final_ans;
		
// 	}

// }

