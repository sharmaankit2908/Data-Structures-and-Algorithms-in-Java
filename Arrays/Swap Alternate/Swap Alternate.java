public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int c;
        for (int i=0;i<(arr.length-1);){
            c=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=c;
            i=i+2;
        }
    }
}