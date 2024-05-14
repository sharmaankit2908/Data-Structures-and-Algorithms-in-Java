
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        // while (n>0){
        //     for (int i=0;i<n-1;i++){
                // if (arr[i]>arr[i+1]){
                //     int c=arr[i];
                //     arr[i]=arr[i+1];
                //     arr[i+1]=c;
                // }
                // else {
                //     continue;
                // }
        //     }
        //     n--;
        // }
        
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }

}