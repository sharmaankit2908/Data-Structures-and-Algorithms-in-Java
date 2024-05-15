import java.util.Arrays;
public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
		int n=budget.length;
		Arrays.sort(budget);
		int max=Integer.MIN_VALUE;
		int a=Integer.MIN_VALUE;
		for (int i=0;i<n;i++){
			a=budget[i]*(n-i);
			if (a >max){
				max=a;
			}
		}
		return max;

	}

}
