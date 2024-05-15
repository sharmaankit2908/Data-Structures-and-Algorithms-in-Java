   
import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
		if (arr.length==0){
			return 0;
		}
		Arrays.sort(arr);
		int ans=0;
		int i=0;
		int n=arr.length;
		int j=n-1;
		while (i<j){
			if ((arr[i]+arr[j])<num){
				i++;
			}
			else if ((arr[i]+arr[j])>num){
				j--;
			}
			else {
				int m1=arr[i];
				int m2=arr[j];
				if (arr[i]==arr[j]){
					int r=j-i+1;
					ans += (n*(n-1)/2);
					return ans;
				}
				else {
					int n1=i+1;
					int n2=j-1;
					while ((n1<=n2) && (arr[n1]==m1)){
						n1++;
					}
					while ((n1<=n2) && (arr[n2]==m2)){
						n2--;
					}
					ans += ((n1-i)*(j-n2));
					i=n1;
					j=n2;
				}
			}
		}
		return ans;
		
	}
}