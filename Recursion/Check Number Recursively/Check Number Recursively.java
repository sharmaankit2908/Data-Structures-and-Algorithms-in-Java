public class Solution {
	public static boolean check(int a[],int n,int x){
		if (n==0){
			boolean p=(a[n]==x);
			return p;
		}
		return ((a[n]==x) || check(a, n-1, x));
	}
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		boolean b=check(input, input.length-1,x);
		return b;	
	}
}