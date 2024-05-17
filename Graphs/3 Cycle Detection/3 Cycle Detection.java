import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int count;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void dfs(boolean[][] graph,boolean[] visited, int n, int current_vertex, int start_vertex, int V){
		visited[current_vertex]=true;
		if (n==0){
			visited[current_vertex]=false;
			if (graph[current_vertex][start_vertex]){
				count++;
			}
			return;
		}

		for (int i=0;i<V;i++){
			if (graph[current_vertex][i] && !visited[i]){
				dfs(graph, visited, n-1, i, start_vertex, V);
			}
			visited[current_vertex]=false;
		}
		
	}

	public static int solve(boolean[][] graph, int n) {
		/*
		 * Your class should be named Solution 
		 * You may write your code here
		 */
		boolean[] visited=new boolean[n];
		for (int i=0;i<(n-2);i++){
			dfs(graph, visited, 2, i, i, n);
			visited[i]=true;
		}
		return count/2;		 
	}

	public static boolean[][] takeInput() throws IOException {
		String[] strNums;
		strNums = br.readLine().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int m = Integer.parseInt(strNums[1]);

		boolean[][] graphs = new boolean[n][n];
		int firstvertex, secondvertex;

		for (int i = 0; i < m; i++) {
			String[] strNums1;
			strNums1 = br.readLine().split("\\s");
			firstvertex = Integer.parseInt(strNums1[0]);
			secondvertex = Integer.parseInt(strNums1[1]);
			graphs[firstvertex][secondvertex] = true;
			graphs[secondvertex][firstvertex] = true;
		}
		return graphs;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] graphs = takeInput();

		int ans = solve(graphs, graphs.length);
		System.out.println(ans);

	}
}