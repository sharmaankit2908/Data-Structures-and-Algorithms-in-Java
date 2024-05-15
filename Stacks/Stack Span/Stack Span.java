import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int n=price.length;
		int stack[]=new int[n];
		stack[0]=0;
		int ks=0;
		int ans[]=new int[n];
		ans[0]=1;
		int ka=1;
		
		for (int i=1;i<n;i++){
			while ((ks>=0) &&  (price[stack[ks]] < price[i])){
				stack[ks--]=0;
			}
			if (ks<0){
				ans[ka++]=i+1;
			}
			else{
				ans[ka++]=i-stack[ks];
			}
			stack[++ks]=i;
		}
		return ans;
	}

}