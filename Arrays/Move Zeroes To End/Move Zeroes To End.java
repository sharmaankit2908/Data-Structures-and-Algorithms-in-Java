public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int j=0;
        for (int i=0;i<a.length;i++){
            if (a[i] !=0){
                a[j]=a[i];
                j++;
            }
        }
        for (int i=j;i<a.length;i++){
            a[i]=0;
         }
        return a;
        
    }
}