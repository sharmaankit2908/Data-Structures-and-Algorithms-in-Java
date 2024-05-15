import java.util.Arrays;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n=arr1.length;
		int m=arr2.length;
		int a=Math.min(n,m);
		int ans[]=new int[a];
		int k=0;

		int i=0,j=0;
		while (i<n && j<m){
			if (arr1[i] <arr2[j]){
				i++;
			}
			else if (arr1[i] >arr2[j]){
				j++;
			}
			else{
				ans[k++]=arr1[i];
				i++;
				j++;
			}
		}
		for (int l=0;l<k;l++){
			System.out.print(ans[l]+" ");
		}
	}

}