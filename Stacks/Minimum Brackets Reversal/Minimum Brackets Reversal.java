import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
		Stack<Character> stack = new Stack<Character>();
		int n=input.length();
		if (n%2 !=0){
			return -1;
		}
		int i=0;
		while (i<n){
			char item=input.charAt(i);
			if (item=='{'){
				stack.push(item);
			}
			else if(item=='}'){
				if (stack.isEmpty()){
					stack.push(item);
				}
				else if (stack.peek()=='{'){
					char c=stack.pop();
				}
				else{
					stack.push(item);
				}
			}
			i++;
		}
		int count=0;
		while (stack.size()>1){
			char c1=stack.pop();
			char c2=stack.pop();
			if (c1==c2){
				count++;
			}
			else{
				count +=2;
			}
		}
		return count;

	}

}