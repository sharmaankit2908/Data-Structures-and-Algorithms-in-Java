public class Solution {

    public static void merge(int[] arr, int l, int mid,int r){
         int m=mid-l+1;
         int n=r-mid;
         int d1[]=new int[m];
         int d2[]=new int[n];
         for (int i=0;i<m;i++){
             d1[i]=arr[l+i];
         }
         for (int i=0;i<m;i++){
             d1[i]=arr[l+i];
         }
         for (int i=0;i<n;i++){
             d2[i]=arr[mid+1+i];
         }
        int k=l;
        int i=0,j=0;
        while (i<m && j<n){
            if (d1[i]<=d2[j]){
                arr[k++]=d1[i++];
            }
            else{
                arr[k++]=d2[j++];
            }
        }
        while (i<m){
            arr[k++]=d1[i++];
        }
        while (j<n){
            arr[k++]=d2[j++];
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if (l  < r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
}
