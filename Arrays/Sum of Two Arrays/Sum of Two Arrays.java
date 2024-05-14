
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int l=output.length;
        int a[]=new int[l];
        int b[]=new int[l];
        int j=0;
        for (int i=arr1.length-1;i>=0;i--){
            a[l-j-1]=arr1[i];
            j++;
        }
        j=0;
        for (int i=arr2.length-1;i>=0;i--){
            b[l-j-1]=arr2[i];
            j++;
        }

        for (int i=l-1;i>0;i--){
            int ab=output[i]+a[i]+b[i];
            output[i]=ab%10;
            output[i-1]=ab/10;
        }
        
        
    }

}