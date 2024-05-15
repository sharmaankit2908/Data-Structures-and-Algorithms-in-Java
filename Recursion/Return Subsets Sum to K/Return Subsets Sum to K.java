public class solution {
	
	public static int[][] subsets(int input[]) {
		// Write your code here
		if (input.length==0){
			return new int[0][0];
		}
		else if (input.length==1){
			int ans[][]=new int[1][1];
			ans[0][0]=input[0];
		}
		int c=input[0];
		int b[]=new int[input.length-1];
		for (int i=1;i<input.length;i++){
			b[i-1]=input[i];
		}
		int ans2[][]=subsets(b);
		int final_ans[][]=new int[2*ans2.length+1][];
		int k=0;
		int a1[]=new int[1];
		a1[0]=c;
		final_ans[k++]=a1;
		for (int i=0;i<ans2.length;i++){
			final_ans[k++]=ans2[i];
		}
		for (int i=0;i<ans2.length;i++){
			int m=0;
			int a[]=new int[ans2[i].length+1];
			a[m++]=c;
			for (int j=0;j<ans2[i].length;j++){
				a[m++]=ans2[i][j];
			}
			final_ans[k++]=a;	
		}
		return final_ans;
	}

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		int ans[][]=subsets(input);
		int m=0;
		int count=0;
		int final_ans[][]=new int[ans.length][];
		for (int i=0;i<ans.length;i++){
			int sum=0;
			for (int j=0;j<ans[i].length;j++){
				sum +=ans[i][j];
			}
			if (sum==k){
				count++;
				final_ans[m++]=ans[i];
			}
		}
		int f[][]=new int[count][];
		for (int i=0;i<count;i++){
			f[i]=final_ans[i];
		}
		return f;
	}
}
