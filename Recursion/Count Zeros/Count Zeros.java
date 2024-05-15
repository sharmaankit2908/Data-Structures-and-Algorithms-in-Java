public class solution {

	public static int countZerosRec(int input){
		// Write your code here
		if (input==0){
			return 1;
		}
		if (input <10){
			if (input%10==0){
				return 1;
			}
			else {
				return 0;
			}
		}
		int smallerinput=input/10;
		if (input%10==0){
			return (1+countZerosRec(smallerinput));
		}
		else {
			 return (countZerosRec(smallerinput));
		} 
			

	}
}


// public class solution {

// 	public static int countZerosRec(int input){
// 		// Write your code here
// 		if (input<10){
// 			if (input==0){
// 				return 1;
// 			}
// 			else {
// 				return 0;
// 			}
// 		}
// 		else if (input <100 && input >=10){
// 			if (input %10==0){
// 				return 1;
// 			}
// 			else {
// 				return 0;
// 			}
// 		}
// 		int b=input%10;
// 		if (b==0){
// 			return (1+countZerosRec(input/10));
// 		}
// 		else {
// 			return countZerosRec(input/10);
// 		}
		
// 	}
// }
