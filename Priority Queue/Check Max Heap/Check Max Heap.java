public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		 int n=arr.length;
		 if (n==0 || n==1){
			 return true;
		 }

		for (int i=0;i<(n-1);i++){
			int parent_index=i;
			int child_index1=2*i+1;
			int child_index2=2*i+2;

			if ((child_index1 <n) && (arr[parent_index] < arr[child_index1])){
				return false;
			}

			if ((child_index2<n) && (arr[parent_index] < arr[child_index2])){
				return false;
			}
		}
		return true;
	}
}