import java.util.* ;
import java.io.*; 
public class Solution {

    public static String helper(String a, String b,int n1, int n2,int index1,int index2, String res,int[][] as,String[][] dp) {
        if (index1==n1 && index2==n2){
            return res;
        }
        else if (index1==n1){
            
            return res+b.substring(index2);
        }
        else if(index2==n2){
            return res+a.substring(index1);
        }
        if (as[index1][index2] !=-1){
            return dp[index1][index2];
        }
        String ans;
        if (a.charAt(index1)==b.charAt(index2)){
            ans =helper(a, b, n1, n2, index1+1, index2+1, res+a.charAt(index1),as,dp);
        }
        else{
            String s1=helper(a, b, n1, n2, index1+1, index2, res+a.charAt(index1),as,dp);
            String s2=helper(a, b, n1, n2, index1, index2+1, res+b.charAt(index2),as,dp);
            if (s1.length()<s2.length()){
                ans= s1;
            }
            else{
                ans= s2;
            }
        }
        as[index1][index2]=1;
        dp[index1][index2]=ans;
        return ans;
    }
    public static String shortestSupersequence(String a, String b) {
        // Write your code here..
        int n1=a.length();
        int n2=b.length();
        String[][] dp=new String[n1][n2];
        int[][] as=new int[n1][n2];
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                as[i][j]=-1;
            }
        }
        String res="";
        return helper(a, b, n1, n2, 0,0, res,as,dp);
    }

}