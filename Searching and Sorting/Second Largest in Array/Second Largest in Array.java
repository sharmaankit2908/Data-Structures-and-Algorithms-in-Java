public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here
        for (int i=0;i<2;i++){
            for (int j=i;j<n-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return (arr[n-2]);
    }

}