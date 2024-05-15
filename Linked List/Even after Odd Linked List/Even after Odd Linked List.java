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

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
        if (head==null || head.next==null){
            return head;
        }

        Node<Integer> even_head=null;
        Node<Integer> even_tail=null;
        Node<Integer> odd_head=null;
        Node<Integer> odd_tail=null;
        // Node<Integer> temp=head;  commented this from your code

        //change temp to head in below code. Wherever is temp written

        while (head !=null){
            if (head.data%2==0){
                if (even_head==null){
                    even_head=head;
                    even_tail=head;
                }
                else{
                    even_tail.next=head;
                    // even_tail=even_tail.next;
                    even_tail=head; //changed this
                }
            }
            else{
                if (odd_head==null){
                    odd_head=head;
                    odd_tail=head;
                }
                else{
                    odd_tail.next=head;
                    // odd_tail=odd_tail.next;
                    odd_tail=head;  //changed this 
                }
            }
            head=head.next;
        }


        if (odd_head != null) {
            odd_tail.next = even_head;
            if (even_tail != null) {
                even_tail.next = null; // Set the next of the last even node to null
            }
            return odd_head;
        } else {
            return even_head;
        }
	}
}