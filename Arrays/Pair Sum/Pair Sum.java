import java.util.Arrays;
public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int count=0;
        // for (int i=0;i<arr.length-1;i++){
        //     for (int j=i+1;j<arr.length;j++){
        //         if ((arr[i]+arr[j])==x){
        //             count++;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if ((arr[i]+arr[j])<x){
                i++;
            }
            else if ((arr[i]+arr[j])>x){
                j--;
            }
            else{
                count++;
                if ((i+1)<arr.length){
                    while (arr[i]==arr[i+1]){
                        i++;
                        count++;
                        if ((i+1)>=j){
                            break;
                        }
                    }
                }
                if ((j-1)>=0){
                    while (arr[j]==arr[j-1]){
                        j--;
                        count++;
                        if ((j-1)<=i){
                            break;
                        }
                    }
                }
                i++;
                j--;
            }
        }
        return count;

    }
}