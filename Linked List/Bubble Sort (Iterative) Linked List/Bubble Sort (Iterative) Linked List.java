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

	public static Node<Integer> bubbleSort(Node<Integer> head) {
		//Your code goes here
		if (head==null || head.next==null){
			return head;
		}
		Node<Integer> temp1=head;
		Node<Integer> temp2=temp1.next;
		Node<Integer> temp3=null;
	
		while (temp1.next !=temp3){

			while (temp2 != temp3){
				if (temp1.data > temp2.data){
					int c=temp1.data;
					temp1.data=temp2.data;
					temp2.data=c;
				}
				temp1=temp1.next;
				temp2=temp2.next;
			}
			temp3=temp1;
			temp1=head;
			temp2=head.next;

		}
		return head;
	}
}