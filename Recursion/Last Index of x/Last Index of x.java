
public class Solution {
	public static int lastIndex1(int input[], int x, int e) {
		if (e==0 && input[e] !=x){
			return -1;
		}
		if (input[e]==x){
			return e;
		}
		return lastIndex1(input, x,e-1);
	}

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return lastIndex1(input,x,input.length-1);
	}
	
}