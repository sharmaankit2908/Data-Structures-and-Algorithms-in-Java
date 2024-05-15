/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if (pos==0){
			head=head.next;
		}
		int count=0;
		Node<Integer> temp=head;

		while (temp !=null){
			if (count+1==pos){
				break;
			}
			count++;
			temp=temp.next;
		}
		if (temp !=null){
			if (temp.next !=null){
				temp.next=temp.next.next;
			}

		}
		return head;
	}
}