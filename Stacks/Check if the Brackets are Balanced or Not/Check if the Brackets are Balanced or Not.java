
public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        int n=expression.length();
        if (n==0){
            return true;
        }
        if (n%2 !=0){
            return false;
        }
        char stack[]=new char[n];
        int i=0;
        int k=0;
        while (i<n){
            if (expression.charAt(i)=='('){
                stack[k++]=expression.charAt(i);
            }
            else{
                if (k==0 || stack[k-1] !='('){
                    return false;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        return k==0;
    }
}