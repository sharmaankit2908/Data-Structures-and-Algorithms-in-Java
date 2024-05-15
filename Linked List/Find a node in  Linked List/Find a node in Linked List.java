/****************************************************************

	Following is the class structure of the Node class:

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> temp=head;
		int count=0;
		int ans=-1;
		while (temp !=null){
			if (temp.data==n){
				ans=count;
				break;
			}
			temp=temp.next;
			count++;

		}
		return ans;
		
	}
}