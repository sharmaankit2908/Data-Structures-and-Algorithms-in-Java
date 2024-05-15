/*************** 
     * Following is the Node class already written 
            class Node<T> {
                T data;
                Node<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

 public class Solution {

	public static Node<Integer> reverse_I(Node<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if (head==null || head.next==null){
            return head;
        }
        else{
            Node<Integer> prev=null;
            Node<Integer> curr=head;
            Node<Integer> next=head;
            while (curr !=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
            return head;
        }
	}
 }