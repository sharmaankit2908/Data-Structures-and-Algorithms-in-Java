public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        int n=arr.length;
        // for (int i=1;i<n;i++){
        //     int j=i-1;
        //     while (j>=0 && arr[j]>arr[i]){
        //         j--;
        //     }
        //     int c=arr[i];
        //     for (int k=i;k>j+1;k--){
        //         arr[k]=arr[k-1];
        //     }
        //     arr[j+1]=c;
        // }
        for (int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}