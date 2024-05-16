public class Solution {
	public static void heapinsert(int[] arr){
		for (int i=1;i<arr.length;i++){
			int child_index=i;
			int parent_index=(child_index-1)/2;
			while (parent_index >=0){
				if (arr[parent_index] > arr[child_index]){
					int temp=arr[parent_index];
					arr[parent_index]=arr[child_index];
					arr[child_index]=temp;
					child_index=parent_index;
					parent_index=(child_index-1)/2;
				}
				else{
					break;
				}	
			}
		}
		return;
	}

	public static void heapremove(int[] arr){
		for (int i=arr.length-1;i>0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			int parent_index=0;
			int child_index1=2*parent_index+1;
			int child_index2=2*parent_index+2;
			int	min_index=parent_index;
			while (child_index1<i){
				if ((child_index1<i) &&(arr[min_index] >arr[child_index1])){
					min_index=child_index1;
				}
				if ((child_index2<i) &&(arr[min_index] > arr[child_index2])){
					min_index=child_index2;
				}
				if (min_index==parent_index){
					break;
				}
				else{
					temp=arr[parent_index];
					arr[parent_index]=arr[min_index];
					arr[min_index]=temp;
					parent_index=min_index;
					child_index1=2*parent_index+1;
					child_index2=2*parent_index+2;
				}
			}
		}
	}


	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		int n=arr.length;
		if (n==0 || n==1){
			return;
		}
		heapinsert(arr);
		heapremove(arr);
	
	}
}