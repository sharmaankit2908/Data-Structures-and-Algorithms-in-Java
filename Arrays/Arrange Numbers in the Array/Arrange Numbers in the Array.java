
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int j=arr.length-1;
        int i=0;
        int m=1;
        while (m<=n){
            if (m%2==0){
                arr[j]=m;
                j--;
            }
            else {
                arr[i]=m;
                i++;
            }
            m++;
        }
    }
}