public class Solution {

	public static boolean search_string(String[] Graph, boolean[][] visited,int x,int y,int N, int M ,int index, String search){
		int[] X_dir = {0,1,-1,0,-1,1,-1,1};
		int[] Y_dir = {1,0,0,-1,-1,-1,1,1};
		visited[x][y] = true;
		if(index==search.length()){
			return true;
		}
		for(int i=0;i<8;i++){
			int a = X_dir[i] +x;
			int b = Y_dir[i] + y;
			if(a>=0 && b>=0 && a<N && b<M && Graph[a].charAt(b) ==search.charAt(index) && !visited[a][b] ){
				boolean ans= search_string(Graph, visited, a, b, N, M, index+1, search);
				if (ans==true){
					return ans;
				}
				visited[a][b]=false;
			}
		}
		visited[x][y]=false;
		return false;
	}

	int solve(String[] Graph , int N, int M){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		boolean visited[][]=new boolean[N][M];
		String s="CODINGNINJA";
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(!visited[i][j] && Graph[i].charAt(j)==s.charAt(0) ){
					
					boolean ans = search_string(Graph, visited, i, j, N, M, 1, s);
					if (ans==true){
						return 1;
					}
				
				}
			}
		}
		return 0;
	}	
}