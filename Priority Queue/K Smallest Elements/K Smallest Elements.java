import java.util.*;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i=0;i<k;i++){
			pq.add(input[i]);
		}
		for (int i=k;i<input.length;i++){
			if (pq.peek() > input[i]){
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for (int i=0;i<k;i++){
			ans.add(pq.poll());
		}
		return ans;

	}
}