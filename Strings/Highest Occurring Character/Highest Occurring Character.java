public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int a[]=new int[26];
		int n=str.length();
		for (int i=0;i<n;i++){
			char ch=str.charAt(i);
			int j=ch-97;
			a[j]++;
		}
		char chr=str.charAt(0);
		int max_index=chr-97;
		int max=a[chr-97];
		for (int i=1;i<n;i++){
			if (a[str.charAt(i)-97]>max){
				chr=str.charAt(i);
				max=a[chr-97];
				max_index=str.charAt(i)-97;
			}
		}
		char ans=(char)(max_index+97);
		return ans;
		
	}

}