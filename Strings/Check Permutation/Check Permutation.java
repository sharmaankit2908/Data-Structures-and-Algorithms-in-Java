
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		int a[]=new int[1000];
		int b[]=new int[1000];
		int n1=str1.length();
		int n2=str2.length();
		if (n1 !=n2){
			return false;
		}
		for (int i=0;i<n1;i++){
			char ch=str1.charAt(i);
			int n=ch;
			a[n]++;
		}
		for (int i=0;i<n2;i++){
			char ch=str2.charAt(i);
			int n=ch;
			b[n]++;
		}
		for (int i=0;i<a.length;i++){
			if (a[i]!=b[i]){
				return false;
			}
		}
		return true;

	}

}