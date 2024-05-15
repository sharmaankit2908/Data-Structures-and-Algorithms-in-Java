public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n=arr.length;
		if (n==0 || n==1){
			return -1;
		}
		int sum=0;
		for (int i=0;i<n;i++){
			sum +=arr[i];
		}
		int a=0;
		for (int i=0;i<n;i++){
			if (i==0){
				if ((sum-arr[i])==a){
					return i;
				}
			}
			else {
				a +=arr[i-1];
				if ((sum-arr[i])==2*a){
					return i;
				}
			}
		}
		return -1;
	}
}