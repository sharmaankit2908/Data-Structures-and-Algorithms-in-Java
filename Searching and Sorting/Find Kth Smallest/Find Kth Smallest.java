public class Solution {
    public static int kthSmallest(int[] arr, int n, int k){
        //Your code goes here
        if (k==0 || k==1){
            while (n>0){
                for (int i=0;i<n-1;i++){
                    if (arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
                n--;
            }
        }
        else{
            while (n-k+1>0){
                for (int i=0;i<n-1;i++){
                    if (arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
                n--;
            }

        }
        return (arr[k-1]);
    }

}