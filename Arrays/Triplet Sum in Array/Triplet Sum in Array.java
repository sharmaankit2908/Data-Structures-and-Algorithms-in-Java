import java.util.Arrays;

public class Solution {    

    public static int tripletSum(int[] arr, int num) {
        // Your code goes here
        int n = arr.length;
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int k = 0; k <= n - 2; k++) {
            int num1 = num - arr[k];
            int i = k + 1;
            int j = n - 1;
            while (i < j) {
                if ((arr[i] + arr[j]) < num1) {
                    i++;
                } else if ((arr[i] + arr[j]) > num1) {
                    j--;
                } else {
                    int m1 = arr[i];
                    int m2 = arr[j];
                    if (arr[i] == arr[j]) {
                        int r = j - i + 1;
                        ans += (r * (r - 1) / 2);
                        i = j; // Skip to the end of duplicate elements
                    } else {
                        int n1 = i + 1;
						int n2 = j - 1;
                        while ((n1 <= n2) && (arr[n1] == m1)) {
                            n1++;
                        }
                        while ((n1 <= n2) && (arr[n2] == m2)) {
                            n2--;
                        }
                        ans += ((n1 - i) * (j - n2));
                        i = n1;
                        j = n2;
                    }
                }
            }
        }
        return ans;
    }

    
}








