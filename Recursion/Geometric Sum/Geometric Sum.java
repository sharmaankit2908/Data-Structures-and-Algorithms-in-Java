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
//public class solution {
// 	public static double finpower(int k){
// 		if (k==1){
// 			return 0.5;
// 		}
// 		return (0.5*finpower(k-1));

// 	}

// 	public static double findGeometricSum(int k){
// 		// Write your code here
// 		if (k==0){
// 			return 1;
// 		}
// 		else if (k==1){
// 			return 1.5;
// 		}
// 		// return (findGeometricSum(k-1)+Math.pow(0.5, k));
// 		return (findGeometricSum(k-1)+finpower(k));

// 	}
// }
