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

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer> newnode=new Node<>(data);
		if (pos==0){
			newnode.next=head;
			head=newnode;
		}
		else{
			int count=pos-1;
			Node<Integer> temp=head;
			while (temp.next != null){
				if (count==0){
					break;
				}
				count--;
				temp=temp.next;
			}
			if (count == 0){
				if (temp.next==null){
					temp.next=newnode;
				}
				else{
					newnode.next=temp.next;
					temp.next=newnode;
				}
			}
		}
		return head;
	}
}