
public class Solution {
	
	public static void placeNQueens(int n){
		int board[][]=new int[n][n];
		placequeens(board, 0, n);
	}
	
	public static boolean check_Safe(int [][]board,int n,int row,int col){
		for (int i=row-1;i>=0;i--){
			if (board[i][col]==1){
				return false;
			}
		}
		for (int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
			if (board[i][j]==1){
				return false;
			}
		}
		for (int i=row-1, j=col+1;i>=0 && j<n;i--,j++){
			if (board[i][j]==1){
				return false;
			}
		}
		return true;
	}

	public static void placequeens(int[][]  board, int row, int n){
		if (row==n){
			for (int i=0;i<n;i++){
				for (int j=0;j<n;j++){
					System.out.print(board[i][j]+" ");
				}
			}
			System.out.println();
			
			return;
		}
		for (int j=0;j<n;j++){
			
			if (check_Safe(board,n,row,j)){
				board[row][j]=1;
				placequeens(board, row+1, n);	
				board[row][j]=0;
			}
		}		
	}
	
}
