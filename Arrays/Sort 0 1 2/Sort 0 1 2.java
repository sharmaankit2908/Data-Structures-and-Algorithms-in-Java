public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int n=arr.length;
        int ans[]=new int[n];
        int zero=0;
        int one=0;
        int two=0;
        if (n !=0){
            for (int i=0;i<n;i++){
                if(arr[i]==0){
                    zero++;
                }
                else if(arr[i]==1){
                    one++;
                }
                else{
                    two++;
                }
            }
    
            int k=0;
            while (zero>0){
                ans[k]=0;
                k++;
                zero--;
            }
            while (one>0){
                ans[k]=1;
                one--;
                k++;
            }
            while (two>0){
                ans[k]=2;
                k++;
                two--;
            }
            for (int i=0;i<n;i++){
                arr[i]=ans[i];
            }
        }
        
    }

}