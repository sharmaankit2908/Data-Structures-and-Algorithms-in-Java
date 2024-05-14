
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n1=arr1.length;
        int n2=arr2.length;
        int ans[]=new int[n1+n2];
        int j=0;
        int i=0;
        int k=0;
        while (i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            // else {
            //     ans[k]=arr1[i];
            //     k++;
            //     i++;
            //     ans[k]=arr2[j];
            //     j++;  
            // }
            k++;
        }
        while (i<n1){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while (j<n2){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }

}