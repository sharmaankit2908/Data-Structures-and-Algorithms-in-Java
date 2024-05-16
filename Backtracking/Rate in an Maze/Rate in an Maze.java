
public class Solution {

	public static boolean ratInAMaze_helper(int maze[][],int[][] path,int i,int j, int n){
		if (i<0 || i>n-1 || j<0 || j>n-1 || maze[i][j]==0 || path[i][j]==1){
			return false;
		}
		if (i==n-1 && j==n-1){
			return true;
		}
		path[i][j]=1;

		if (ratInAMaze_helper(maze, path, i+1, j,n) || ratInAMaze_helper(maze, path, i-1, j,n) || ratInAMaze_helper(maze, path, i, j+1,n) || ratInAMaze_helper(maze, path, i, j-1,n)){
			return true;
		}
		return false;
	}

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
		int n=maze.length;
		int path[][]=new int[n][n];

		return ratInAMaze_helper(maze,path,0,0,n);

		

	}
}
