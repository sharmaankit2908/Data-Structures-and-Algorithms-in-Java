public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here

        int l=arr.length;
        if (l==0 || l==1){
            return 0;
        }
        int i=0;
        while (i<(l-1)){
            if (arr[i]>arr[i+1]){
                break;
            }
            i++;
        }
        if (i==l-1){
            return 0;
        }
        else {
            return (i+1);
        }

    }

}