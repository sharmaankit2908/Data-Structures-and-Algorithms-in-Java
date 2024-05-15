public class Solution {

 public static String Palindrome(String str,int n) {

        if ((str.length()==0) || (str.length()==1)){
            return str;
        }
        
        if (str.length()==n+1){
            return (String.valueOf(str.charAt(n)));
        }
        return (Palindrome(str,n+1)+(String.valueOf(str.charAt(n))));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        String ans =  Palindrome(str,0);
        // System.out.println(ans);

        if (ans.equals(str)){
            return true;
        }
        return false;
    }
}

//public class Solution {
//     public static boolean isPalindrome(String str) {
//         // Write your code here.
//         int n=str.length();
//         if (n==0 || n==1){
//             return true;
//         }
//         int i=0;
//         int j=n-1;
//         // if (i==j){
//         //     return true;
//         // }
    
//         return ((str.charAt(i)==str.charAt(j)) && isPalindrome(str.substring(1,str.length()-1)));

//     }
// }

    
