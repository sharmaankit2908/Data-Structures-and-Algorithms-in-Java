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

	public static void printKeypad(int input){
		// Write your code here

		String ans[]=keypad(input);
		for (int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
		
	}
}
// public class solution {
// 	public static String get(int a){
// 		String ans;
// 		if (a==0 || a==1){
// 			ans="";
// 		}
// 		else if (a==2){
// 			ans="abc";
// 		}
// 		else if(a==3){
// 			ans="def";
// 		}
// 		else if(a==4){
// 			ans="ghi";
// 		}
// 		else if(a==5){
// 			ans= "jkl";
// 		}
// 		else if(a==6){
// 			ans="mno";
// 		}
// 		else if(a==7){
// 			ans="pqrs";	
// 		}
// 		else if(a==8){
// 			ans="tuv";
// 		}
// 		else {
// 			ans="wxyz";
// 		}
// 		return ans;
// 	}

// 	public static void printKeypad_helper(int input,String s){
// 		if (input==0){
// 			System.out.println(s);
// 			return;
// 		}	
// 		int n1=input/10;
// 		int n2=input%10;
// 		String s1=get(n2);
// 		for (int i=0;i<s1.length();i++){
// 			printKeypad_helper(n1,s1.charAt(i)+s);
// 		}
// 	}

// 	public static void printKeypad(int input){
// 		// Write your code here	
// 		printKeypad_helper(input,"");		
// 	}
// }

