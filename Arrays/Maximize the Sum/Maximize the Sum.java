public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int i = 0, j = 0; 
        long result = 0, sum1 = 0, sum2 = 0; 
		int m=input1.length;
		int n=input2.length;
        while (i < m && j < n) { 
            if (input1[i] < input2[j]) 
                sum1 += input1[i++]; 
            else if (input1[i] > input2[j]) 
                sum2 += input2[j++]; 
            else { 
                result += Math.max(sum1, sum2) + input1[i]; 
                sum1 = 0; 
                sum2 = 0; 
                i++; 
                j++; 
            } 
        } 

        while (i < m) 
            sum1 += input1[i++]; 
        while (j < n) 
            sum2 += input2[j++]; 
        result += Math.max(sum1, sum2); 

		long ans=result;
  
        return ans; 
		
	}
}