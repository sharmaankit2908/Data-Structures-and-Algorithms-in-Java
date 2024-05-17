public class Solution {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static int helper(String[] edge,boolean[][] visited, int i,int j, int n){
		int[] X_dim={1,-1,0,0};
		int[] Y_dim={0,0,1,-1};
		int current_ans=0;
		visited[i][j]=true;
		for (int m=0;m<4;m++){
			int a=i+X_dim[m];
			int b=j+Y_dim[m];
			if (a>=0 && b>=0 && a<n && b<n && !visited[a][b] && edge[a].charAt(b)=='1'){
				int n1= helper(edge, visited, a, b, n);
				current_ans +=n1;
			}
		}
		return current_ans+1;
	}

	public static int dfs(String[] edge, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		int ans=0;
		boolean visited[][]=new boolean[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (edge[i].charAt(j)=='1' && !visited[i][j]){
					int current_ans=helper(edge, visited, i, j, n);
					ans=Math.max(ans, current_ans);
				}
			}
		}
		return ans;
	}
}