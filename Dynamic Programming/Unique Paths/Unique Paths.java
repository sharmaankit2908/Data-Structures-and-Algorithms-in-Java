import java.util.*;
public class Solution {
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int[][] ans=new int[n][m];
        if (mat.get(0).get(0)==-1){
            return 0;
        }
        ans[0][0]=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i==0 && j==0){
                    continue;
                }
                int l_r=0;
                int u_d=0;
                if (mat.get(i).get(j)==-1){
                    ans[i][j]=0;
                    continue;
                }
                if (i-1>=0){
                    l_r=ans[i-1][j];
                }
                if (j-1>=0){
                    u_d=ans[i][j-1];
                }
                ans[i][j]=l_r+u_d;
            }
        }
        return ans[n-1][m-1];
    
    }

}
