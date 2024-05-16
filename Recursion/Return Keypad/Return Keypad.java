

public class solution {

	public static String get(int a){
		String ans;
		if (a==0 || a==1){
			ans="";
		}
		else if (a==2){
			ans="abc";
		}
		else if(a==3){
			ans="def";
		}
		else if(a==4){
			ans="ghi";
		}
		else if(a==5){
			ans= "jkl";
		}
		else if(a==6){
			ans="mno";
		}
		else if(a==7){
			ans="pqrs";	
		}
		else if(a==8){
			ans="tuv";
		}
		else {
			ans="wxyz";
		}
		return ans;
	}

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
		if (n<10){
			String b1=get(n);
			String ans[]=new String[b1.length()];
			for (int i=0;i<b1.length();i++){
				ans[i]=String.valueOf(b1.charAt(i));
			}
			return ans;
		}
		String m1[]=keypad(n/10);
		String m2[]=keypad(n%10);
		if (m1.length>0 && m2.length >0){
			String ans[]=new String[m1.length*m2.length];
			int k=0;
			for (int i=0;i<m1.length;i++){
				for (int j=0;j<m2.length;j++){
					ans[k]=m1[i]+m2[j];
					k++;
				}
			}
			return ans;
		}
		else if (m1.length>0){
			return m1;
		}
		else if (m2.length >0){
			return m2;
		}
		else {
			return new String[0];
		}
	}
	
}

// public class solution {

// 	// Return a string array that contains all the possible strings
// 		public static String get(int a){
// 			String ans;
// 			if (a==0 || a==1){
// 				ans=" ";
// 			}
// 			else if (a==2){
// 				ans="abc";
// 			}
// 			else if(a==3){
// 				ans="def";
// 			}
// 			else if(a==4){
// 				ans="ghi";
// 			}
// 			else if(a==5){
// 				ans= "jkl";
// 			}
// 			else if(a==6){
// 				ans="mno";
// 			}
// 			else if(a==7){
// 				ans="pqrs";	
// 			}
// 			else if(a==8){
// 				ans="tuv";
// 			}
// 			else {
// 				ans="wxyz";
// 			}
// 			return ans;
// 		}
// 	public static String[] keypad(int n){
// 		// Write your code here
// 		if (n==0){
// 			String[] ans=new String[1];
// 			ans[0]="";
// 			return ans;
// 		}
// 		String[] small_output=keypad(n/10);
// 		int m=n%10;
// 		String s=get(m);	
// 		String[] final_ans=new String[s.length()*small_output.length];
// 		int k=0;
// 		for (int i=0;i<small_output.length;i++){
// 			for (int j=0;j<s.length();j++){
// 				final_ans[k++]=small_output[i]+s.charAt(j);
// 			}
// 		}
// 		return final_ans;

// 	}
	
// }

