public class solution {

	public static int binarySearch(int input[], int x,int s, int e) {
		// Write your code here

		if (input.length ==0){
			return -1;
		}
		if (s>e){
			return -1;
		}
		int mid=(s+e)/2;
		if (input[mid]==x){
			return mid;
		}
		else if (input[mid] >x){
			return binarySearch(input,x,s, mid-1);
		}
		else {
			return binarySearch(input,x,mid+1,e);
		}
	}
	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		return binarySearch(input,element,0,input.length-1);

	}
