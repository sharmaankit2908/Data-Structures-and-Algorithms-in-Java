import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 long target=N;
		 if (N==0 || N==1){
			 return ((int)N);
		 }
		long l=2;
		long r=N;
		long ans=0;
        while (l<r){
            long mid=(l+r)/2;
            if (mid <=(target/mid)){
				l=mid+1;
            }
           else{
			   r=mid;
            }
        }
		return (int)(l-1);

	}
}