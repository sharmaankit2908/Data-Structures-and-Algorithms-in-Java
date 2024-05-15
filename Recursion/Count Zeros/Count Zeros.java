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