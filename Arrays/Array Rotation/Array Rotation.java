public class Solution {
    public static void rotate(int a[],int start_index,int end_index){
        if (start_index < end_index){
            while (start_index != end_index){
                int c=a[start_index];
                a[start_index]=a[end_index];
                a[end_index]=c;
                start_index++;
                end_index--;
            }
        }
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        String direction=dir;
        int l=a.length;
        x=2;
        // if (direction=="LEFT"){
        //     rotate(a,0,x-1);
        //     rotate(a,x,l-1);
        //     rotate(a,0,l-1);

        // }
        // else{
        //     rotate(a,0,l-x-1);
        //     rotate(a,l-x,l-1);
        //     rotate(a,0,l-1);
        // }
        rotate(a,0,x-1);
        rotate(a,x,l-1);
        rotate(a,0,l-1);
        return a;
    }
}