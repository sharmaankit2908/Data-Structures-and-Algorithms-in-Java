
public class Solution {
	public static int partition(int[] input,int startIndex, int endIndex){
		int count=0;
		int pivot=input[startIndex];
		for (int i=startIndex+1;i<=endIndex;i++){
			if (input[i] < pivot){
				count++;
			}
		}

		int c= input[startIndex];
		input[startIndex]=input[startIndex+count];
		input[startIndex+count]=c;

		int p=startIndex+count;

		int i=startIndex;
		int j=endIndex;
		// while (i<j){

		// 	if (input[i] < pivot){
		// 		i++;
		// 	}
		// 	else if(input[j] >=pivot){
		// 		j--;
		// 	}
		// 	else {
		// 		int d= input[i];
		// 		input[i]=input[j];
		// 		input[j]=d;
		// 		i++;
		// 		j--;
		// 	}
		// }
		while (i < p &&  j >p){ 
			while (i <p && input[i] < pivot){
				i++;
			}
			while (j>p && input[j] >= pivot){
				j--;
			}
			int d= input[i];
			input[i]=input[j];
			input[j]=d;
			i++;
			j--;
		}
	

		return p;
	}



	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if (startIndex < endIndex){
			int i=partition(input,startIndex,endIndex);
			quickSort(input,startIndex,i-1);
			quickSort(input,i+1,endIndex);
		 }
		
	}
	
}