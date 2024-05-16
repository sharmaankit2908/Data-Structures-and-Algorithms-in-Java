/*
	Note:
	To get all the test cases accepted, make recursive calls in following order: Top, Down, Left, Right.
	This means that if the current cell is (x, y), then order of calls should be: top cell (x-1, y), 
	down cell (x+1, y), left cell (x, y-1) and right cell (x, y+1).
*/  

public class Solution {

	public static void ratInAMaze_helper(int maze[][], int n,int[][] path, int i,int j){

		if (i<0 || i>=n || j<0 || j>=n || path[i][j]==1 || maze[i][j]==0){
			return;
		}
		path[i][j]=1;

		if (i==n-1 && j==n-1){
			for (int r=0;r<n;r++){
				for (int c=0;c<n;c++){
					System.out.print(path[r][c]+" ");
				}
			}
			System.out.println();
			path[i][j]=0;
			return;
		}
		

		ratInAMaze_helper(maze, n, path, i-1, j);
		ratInAMaze_helper(maze, n, path, i+1, j);
		ratInAMaze_helper(maze, n, path, i, j-1);
		ratInAMaze_helper(maze, n, path, i, j+1);
		path[i][j]=0;
		
	}


	



	static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
		
		int[][] path=new int[n][n];
		ratInAMaze_helper(maze, n,path,0,0);

	}

}