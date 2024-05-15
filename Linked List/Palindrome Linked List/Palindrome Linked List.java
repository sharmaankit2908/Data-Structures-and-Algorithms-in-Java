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

	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if (head ==null || head.next ==null){
			return true;
		}
		if (head.next.next ==null){
			if (head.data.equals(head.next.data)){
				return true;
			}
			else {
				return false;
			}
		}
		Node<Integer> temp=head;

		while (temp.next.next !=null ){
			temp=temp.next;
		}
		boolean b1=false;
		Node<Integer> temp1=temp.next;

		if (temp1.data.equals(head.data)){
			b1=true;	
		}
		Node<Integer> newhead=head.next;
		Node<Integer> tail=newhead;
		while (tail !=temp){
			tail=tail.next;
		}
		tail.next=null;
		boolean b2=isPalindrome(newhead);
		return (b1&&b2);
	}

}