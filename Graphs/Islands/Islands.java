public class Solution {
	static boolean[] visited;;
	public static void dfs(int[][] adjacency_matrix, int start_index,int n){
		visited[start_index]=true;
		for(int i=0;i<n;i++){
			if (adjacency_matrix[start_index][i]==1 && !visited[i]){
				dfs(adjacency_matrix,i,n);
			}
		}		
	}

	public static int numConnected(int[][] edges, int n) {
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		visited=new boolean[n];
		int count=0;
		int[][] adjacency_matrix=edges;		
		for (int i=0;i<n;i++){
			if (visited[i]==false){
				count++;
				dfs(adjacency_matrix, i, n);
			}
		}
		return count;
	}
}