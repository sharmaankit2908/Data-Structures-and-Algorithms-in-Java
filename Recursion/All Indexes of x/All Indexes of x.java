
public class Solution {

	public static int[] allIndexe1(int input[], int x, int s) {
		// if (input.length==0){
		// 	return (new int[0]);
		// }
		if (s==input.length){
			return (new int[0]);
		}

		int small_ans[]=allIndexe1(input,x,s+1);
		if (input[s]==x){
			int ans[]=new int[small_ans.length+1];
			ans[0]=s;
			for (int i=1;i<ans.length;i++){
				ans[i]=small_ans[i-1];
			}
			return ans;
		}

		return small_ans;
	}

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexe1(input,x,0);
		
	}
	
}