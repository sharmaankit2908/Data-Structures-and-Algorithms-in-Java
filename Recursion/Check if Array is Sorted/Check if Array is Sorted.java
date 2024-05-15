public class Solution {
    public static boolean arraySortedOrNot(int []A, int N) {
        // Write your code here.
        if (N==1){
            return true;
        }
        if (N==2){
            if (A[N] <A[N-1]){
                return false;
            }
            return true;
        }
        boolean c=((A[N-1] >= A[N-2]) && arraySortedOrNot(A, N-1));
        return c;
    }
}