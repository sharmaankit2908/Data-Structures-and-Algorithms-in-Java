import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> stack = new Stack<Character>();
		int n=expression.length();
		int i=0;
		while (i<n){
			char item=expression.charAt(i);
			if (item !=')'){
				stack.push(item);
			}
			else{
				int count=0;
				while (!stack.isEmpty() && stack.peek() !='('){
					char c1=stack.pop();
					count++;
				}
				if (stack.isEmpty()){
					return true;
				}
				char c2=stack.pop();
				if (count <2){
					return true;
				}
			}
			i++;
		}
		return false;
		
	}
}