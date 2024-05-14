public class Solution {
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        
        int row=a.length;
        int cols=a[0].length;
        int ans[]=new int[row*cols];
        int k=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                ans[k]=a[i][j];
                k++;
                
            }
        }
        return ans;

    }
}