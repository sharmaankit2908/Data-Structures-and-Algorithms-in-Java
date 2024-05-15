public class Solution {

    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
        */
        return sum2(input, input.length);
    }

    public static int sum2(int input[], int N) {
        if (N == 1) {
            return input[0];
        }
        return (input[N-1] + sum2(input, N - 1));
    }
}