import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		int n=input.size();

		if (input.isEmpty()){
			return input;
		}
		if (k==0 || k==1 ){
			return input;
		}

		Stack<Integer> stack=new Stack<>();
		int i=0;
		while(i<k){
			stack.add(input.poll());
			i++;
		}
		while (!stack.isEmpty()){
			input.add(stack.pop());
		}
		i=0;
		while (i<(n-k)){
			input.add(input.remove());
			i++;
		}
		return input;


	}
}