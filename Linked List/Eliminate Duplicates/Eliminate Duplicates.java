/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		Node<Integer> temp=head;
		if (head ==null || head.next==null){
			return head;
		}
		while (temp.next !=null){
			while (temp.next !=null && temp.data.equals(temp.next.data)){
				temp.next=temp.next.next;
				}
			if (temp.next ==null){
				return head;
				}
			temp=temp.next;
		}
		return head;
	}

}