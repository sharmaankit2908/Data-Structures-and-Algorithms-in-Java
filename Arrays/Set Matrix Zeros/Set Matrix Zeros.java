import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n=matrix.length;
        int m=matrix[0].length;
        boolean flag[][]=new boolean[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    flag[i][j]=true;
                }
            }
        }
        int zero_row[]=new int[m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j]==0){
                    matrix[i]=zero_row;
                    break;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if ((matrix[j][i]==0) && (flag[j][i]==true)){
                    for (int k=0;k<n;k++){
                        matrix[k][i]=0;
                    }
                    break;
                }
            }
        }

        
    }

}