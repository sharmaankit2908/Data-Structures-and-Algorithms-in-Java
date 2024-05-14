public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
		String s="";
		int n=str.length();
		int i=0;
		while (i<n){
			int count=1;
			while (str.charAt(i) == str.charAt(i+1)){
				i++;
				count++;
			}
			s +=str.charAt(i);
			if (count >1){
				s +=count;
			}

		}
		return s;
	}

}