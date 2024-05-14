public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
		int n=mat.length;
		if (n==0){
			System.out.println("row 0 -2147483648");
		}
		else{
			int m=mat[0].length;
			String s="";
			int number=-1;
			int largest=-2147483648;
			for (int i=0;i<n;i++){
				int sum=0;
				for (int j=0;j<m;j++){
					sum +=mat[i][j];
				}
				if (sum>largest){
					largest=sum;
					s="row";
					number=i;
				}
			}

			for (int i=0;i<m;i++){
				int sum=0;
				for (int j=0;j<n;j++){
					sum +=mat[j][i];
				}
				if (sum>largest){
					largest=sum;
					s="column";
					number=i;
				}
			}
			System.out.println(s + " " + number + " " + largest);
		}
	}

}