// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     static int energyloss;
//     public static int helper(int n, int heights[],int index,int current_loss) {

//         // Write your code here..
//         if (index+1==n){
//             return current_loss;
//         }
//         if (index==n-2){
//             return  current_loss+Math.abs(heights[n-1]-heights[n-2]);
//         }
//         int n1=helper(n, heights, index+2,current_loss+Math.abs(heights[index+2]-heights[index]));
//         int n2=helper(n, heights, index+1, current_loss+Math.abs(heights[index+1]-heights[index]));
//         return Math.min(n1,n2);
//     }
//     public static int frogJump(int n, int heights[]) {

//         // Write your code here..
//         if (n==0 || n==1){
//             return 0;
//         }
//         return helper(n, heights, 0,0);
//     }

// }
import java.util.* ;
import java.io.*; 
public class Solution {
        public static int frogJump_helper(int n, int heights[], HashMap<Integer,Integer> ans) {
            if (ans.containsKey(n)){
                return ans.get(n);
            }

            for (int i=2;i<=n;i++){
                if (!ans.containsKey(i)){
                    int jump1,jump2=Integer.MAX_VALUE;
                    jump1=Math.abs(heights[i-1]-heights[i-2])+ans.get(i-1);
                    if (i-2>0){
                        jump2=Math.abs(heights[i-1]-heights[i-3])+ans.get(i-2);
                    }
                    ans.put(i,Math.min(jump1, jump2));
                }
            }
            return ans.get(n);
        }
        public static int frogJump(int n, int heights[]) {

        // Write your code here..
 
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,0);
        ans.put(1,0);
        frogJump_helper(n, heights, ans);
        return ans.get(n);
        
    }

}