import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if (input.size()==0 || input.size()==1){
			return;
		}
		int temp=input.pop();
		reverseStack(input, extra);
		while ( !input.isEmpty()){
			int c=input.pop();
			extra.push(c);
		}
		input.push(temp);

		while ( !extra.isEmpty()){
			int m=extra.pop();
			input.push(m);
		}
		

	}
}