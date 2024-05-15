
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n=arr.length;
        if (n==0 || n==1){
            return;
        }
        d=d%n;
        int ans[]=new int[d];
        for (int j=0;j<d;j++){
            ans[j]=arr[j];
        }
        int i=0;
        for (;i<n-d;i++){
            arr[i]=arr[((i+d)%n)];
        }
        for (;i<n;i++){
            arr[i]=ans[i-(n-d)];
        }
    }

}