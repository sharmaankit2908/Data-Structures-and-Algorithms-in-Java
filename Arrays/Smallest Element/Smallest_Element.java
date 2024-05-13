import java.util.Scanner;
public class Solution {

    public static int minimum_element(int[] arr){
        int minimum_element=arr[0];
        for (int i:arr){
            if (minimum_element >=i){
                minimum_element=i;
            }
        }
        return minimum_element;		
    }
     
}