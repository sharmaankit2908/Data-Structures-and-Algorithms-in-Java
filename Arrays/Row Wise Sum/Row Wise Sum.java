public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		int m=mat.length;
		if (m==0){
			int b=4;
		}
		else {
		// 	for (int i=0;i<mat.length;i++){
		// 		int sum=0;
		// 		for (int j=0;j<mat[i].length;j++){
		// 			sum +=mat[i][j];
		// 		}
		// 		System.out.print(sum+" ");
		// 		// if (i !=(mat.length-1)){
		// 		// 	System.out.print(" ");

		// 		// }
		// 	}
		// }
			for (int i[]:mat){
				int sum=0;
				for (int element:i){
					sum +=element;
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}