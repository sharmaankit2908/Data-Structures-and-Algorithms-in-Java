public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		int n=str.length();
		for (int i=0;i<n;i++){
			char ch=str.charAt(i);
			String ans=""+ch;
			for (int j=i+1;j<n;j++){
				System.out.println(ans);
				ans +=str.charAt(j);
			}
			System.out.println(ans);
		}
	}

}