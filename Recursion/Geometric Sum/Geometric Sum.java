public class solution {

	public static double findGeometricSum(int k){
		// Write your code here

		if (k==0){
			return 1;
		}
		if (k==1){
			return (1.50);
		}
		if (k==2){
			return (1.75);
		}

		return ((findGeometricSum(k-1))+Math.pow(2,-k));

	}
}