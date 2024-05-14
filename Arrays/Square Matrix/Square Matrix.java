import java.util.*;
public class Solution {
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
{
        // Write your code here.
        String ans="";
        if (n==m){
            ans +="YES";
        }
        else {
            ans +="NO";
        }
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==j){
                    diag[k]=mat[i][j];
                    k++;
                }
            }
        }
        return ans;

    }
}