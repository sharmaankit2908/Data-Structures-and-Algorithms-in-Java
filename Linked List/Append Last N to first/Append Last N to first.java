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

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		Node<Integer> temp=head;
		if (head==null){
			return head;
		}
		int length=0;
		while (temp !=null){
			temp=temp.next;
			length++;
		}
		n=n%length;
		temp=head;
		if (n < length && n !=0){
			int pos=length-n-1;
			while (temp.next !=null && pos >0){
				temp=temp.next;
				pos--;
			}
			Node<Integer> newhead=temp.next;
			temp.next=null;
			Node<Integer> temp3=newhead;
			while (temp3.next !=null){
				temp3=temp3.next;
			}
			temp3.next=head;
			head=newhead;
		}
		return head;

	}

}