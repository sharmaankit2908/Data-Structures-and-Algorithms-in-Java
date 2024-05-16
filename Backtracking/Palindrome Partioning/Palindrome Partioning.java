import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean checkpalindrome(String s){
        String reverse_s="";
        int n=s.length();
        for (int i=0;i<s.length();i++){
            reverse_s  += s.charAt(n-1-i);
        }
        return s.equals(reverse_s);
    }
    public static void partition_helper(String s, List<String> current, int start, List<List<String>> ans){
        if (start == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String sub = s.substring(start, end + 1);
            if (checkpalindrome(sub)) {
                current.add(sub);
                partition_helper(s, current, end + 1, ans);
                current.remove(current.size() - 1);
            }
        }

   
    }
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> ans=new ArrayList<List<String>>();
        // if (s.isEmpty()){
        //     return ans;
        // }
        partition_helper( s, new ArrayList<>(), 0, ans);
        return ans;
    }
}