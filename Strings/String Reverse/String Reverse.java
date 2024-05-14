import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    int n=arr.length;
    char ch[]=new char[n];
    for (int i=0;i<n;i++){
      ch[n-i-1]=arr[i];
    }
    String ans=new String(ch);
    return ans;

  }
}