public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n=arr.length;
        int i=0;
        while (i<n-1){
            int minimum=i;
            for (int j=i+1;j<n;j++){
                if (arr[minimum] > arr[j]){
                    minimum=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;
            i++;
        }
    }
}