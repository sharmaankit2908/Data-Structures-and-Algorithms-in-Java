public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        // int n=arr.length;
        // for (int i=0;i<arr.length;i++){
        //     for (int j=i+1;j<arr.length;j++){
        //         if (arr[i]==arr[j]){
        //             return arr[i];
        //         }
        //     }
        // }
        // return -1;
        int n=arr.length;
        int sum1=n*(n-1)/2;
        int sum2=0;
        for (int i=0;i<n;i++){
            sum2 +=arr[i];
        }
        return (n-(sum1-sum2)-1);

    }
}