import java.util.*;


public class Solution {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
		int ans=0;
		int n=input.length;
		if (n==0 || n==1){
			return n;
		}

		for (int i=0;i<n;i++){
			pq.add(input[i]);
		}
		ArrayList<Integer> index=new  ArrayList<>();
		for (int i=0;i<input.length;i++){
			index.add(i);
		}
		int i=0;
		while(true){
			if ((pq.size() !=0) && (input[index.get(i)]==pq.peek())){
				ans++;
				if (i==k){
					return ans;
				}
				pq.poll();
				
			}
			else{
				index.add(i%n);
			}
			i=(i+1)%n;
		}
	}
}