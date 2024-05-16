public class Solution {
	public static boolean isvalid_sudoku(int row, int col, int fill_value, int matrix[][]){
		for (int i=0;i<9;i++){
			if (matrix[row][i]==fill_value){
				return false;
			}
			if (matrix[i][col]==fill_value){
				return false;
			}
			if (matrix[3*(row/3)+i/3][3*(col/3)+i%3]==fill_value){
				return false;
			}
		}
		return true;
	}

	public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.
		int n=matrix.length;
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (matrix[i][j]==0){
					for (int k=1;k<10;k++){
						if (isvalid_sudoku(i,j,k,matrix)){
							matrix[i][j]=k;
							if (isItSudoku(matrix)==true){
								return true;
							}
							else{
								matrix[i][j]=0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
}
