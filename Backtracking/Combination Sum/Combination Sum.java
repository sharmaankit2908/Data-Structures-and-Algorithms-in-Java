import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public static void helper(int[] arr, List<Integer> current, int index, List<List<Integer>> ans, int target ){
        if (target==0) {
            ans.add(new ArrayList<>(current));
            return;
        }        
        if (index==arr.length){
            return;
        }
        if (arr[index]<=target){
            current.add(arr[index]);
            helper(arr, current, index, ans, target-arr[index]);
            current.remove(current.size()-1);
        }

        helper(arr, current, index+1, ans, target);
    }
    public static List< List < Integer > > combSum(int []ARR, int B) {
        // Write your code here.
        Arrays.sort(ARR);
        
        List<List<Integer>> ans=new ArrayList<>();
        helper(ARR, new ArrayList<Integer>(), 0, ans, B);
        return ans;
        
    }
}