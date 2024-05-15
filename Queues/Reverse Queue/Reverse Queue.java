import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		if (input.isEmpty()){
			return;
		}
		// Queue<Integer> queue1=new LinkedList<>();
		int i=input.remove();
		reverseQueue(input);
		input.add(i);
	}

}