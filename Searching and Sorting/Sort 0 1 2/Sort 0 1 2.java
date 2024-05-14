public class Solution {
    public static void sort012(int[] arr, int n){
        //Your code goes here
        int one=0,zero=0,two=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zero++;
            }
            else if (arr[i]==1){
                one++;
            }
            else {
                two++;
            }
        }
        int k=0;
        while (zero>0){
            arr[k++]=0;
            zero--;
        }
        while (one>0){
            arr[k++]=1;
            one--;
        }
        while (k<n){
            arr[k++]=2;
        }
    }

}