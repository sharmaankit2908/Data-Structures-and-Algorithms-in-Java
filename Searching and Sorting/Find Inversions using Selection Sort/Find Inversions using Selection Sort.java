public class Solution {
    public static int getInversions(int[] arr, int n){
        //Your code goes here
        int ans=0;
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[min] > arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=arr[min];
            ans +=(min-i);
        }
        return ans;
    }

}