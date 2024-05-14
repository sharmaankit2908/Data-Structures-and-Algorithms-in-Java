
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
		int m=mat.length;
		if (m !=0){
			int n=mat[0].length;
			int trans[][]=new int[n][m];
			for (int i=0;i<m;i++){
				for (int j=0;j<n;j++){
					trans[j][i]=mat[i][j];
				}
			}
			for (int i=0;i<n;i++){
				if (i%2==0){
					for (int j=0;j<m;j++){
						System.out.print(trans[i][j]+" ");
					}
				}
				else{
					for (int j=m-1;j>=0;j--){
						System.out.print(trans[i][j]+" ");
					}
				}
			}

		}
	}

}