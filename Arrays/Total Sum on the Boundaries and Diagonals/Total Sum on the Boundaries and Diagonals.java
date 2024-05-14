
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		int m=mat.length;
		if (m==0){
			System.out.print(0);
		}
		else{ 
			int n=mat[0].length;
			int ans=0;
			for (int i=0;i<m;i++){
				for (int j=0;j<n;j++){
					if ((((i==0) ||(i==n-1))|| ((j==0) ||(j==n-1))) || ((j==i)||(j==n-i-1))){
						ans +=mat[i][j];
					}
				}
			}
			System.out.println(ans);
		}
		
	}

}