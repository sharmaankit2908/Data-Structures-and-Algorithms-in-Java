import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            ArrayList<Integer> d=new ArrayList<>();
            for(int j=0;j<triangle[i].length;j++){
                d.add(0);
            }
            ans.add(d);
        }

        int current_sum=0;
        for (int i=0;i<n;i++){
             current_sum +=triangle[i][i];
            ans.get(i).set(i, current_sum);
        }

        int j=0;
        int mod=1000000007;
        int sum=ans.get(j).get(j);
        for (int i=j+1;i<n;i++){
            sum = (sum+triangle[i][j])%mod;
            // System.out.print(sum+" ");
            ans.get(i).set(j, sum);
        }
            
        
        

        j=1;
        while (j<n){
            
            for (int i=j+1;i<n;i++){
                sum=Math.min(ans.get(i-1).get(j),ans.get(i-1).get(j-1));
                sum = (sum +triangle[i][j])%mod;
                // System.out.print(sum+" ");
                ans.get(i).set(j, sum);
            }
            // System.out.println();
            j++;
        }


        ArrayList<Integer> c=ans.get(ans.size()-1);
        int minim=Integer.MAX_VALUE;
        for (int m=0;m<c.size();m++){
            
            if (c.get(m) < minim){
                minim=c.get(m);
            }
        }
        return minim;
    }
}