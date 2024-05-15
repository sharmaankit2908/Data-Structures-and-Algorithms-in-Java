

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

	public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here
        if (head==null || head.next==null){
            return head;
        }
        
        Node<Integer> smallhead=reverseRec(head.next);
        Node<Integer> tail_reversed=head.next;
        tail_reversed.next=head;  
        head.next=null;
        return smallhead;
    
	}

}