
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
		String s[]=str.split(" ");
		int n=s.length;
		String rev_sent="";
		for (int i=0;i<s.length;i++){
			String a=s[i];
			String nstr="";
			char ch;
			for (int j=0; j<a.length(); j++){
				ch= a.charAt(j); 
				nstr= ch+nstr;
			}
			rev_sent=rev_sent+nstr+" ";
		}
		return rev_sent;



		// int n=str.length();
		// char ch[]=new char[n];
		// for (int i=0;i<n;i++){
		// 	ch[i]=str.charAt(i);
		// }
		// int i=0;
		// int j=n-1;
		// while (i<j){
		// 	char chr=ch[i];
		// 	ch[i]=ch[j];
		// 	ch[j]=chr;
		// 	i++;
		// 	j--;
		// }
		// String s=new String(ch);
		// String s1[]=s.split(" ");
		// i=0;
		// j=s1.length-1;
		// while (i<j){
		// 	String d=s1[i];
		// 	s1[i]=s1[j];
		// 	s1[j]=d;
		// 	i++;
		// 	j--;
		// }
		// String ans=String.join(" ", s1);
		// return ans;


	}

}