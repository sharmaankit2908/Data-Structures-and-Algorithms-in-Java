public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here

		if (n==0){
			return 0;
		}
		else if (n==1){
			return m;
		}
		return m+multiplyTwoIntegers(m, n-1);
	
	}
}