public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		 int n=input.length;
		 if (n !=0){
		 	int max=input[n-1];
			 System.out.print(max+" ");
			 for (int i=n-2;i>=0;i--){
				 if (input[i]>=max){
					 max=input[i];
					 System.out.print(max+" ");
				 }
			 }
		 }
		 
		
	}
}
