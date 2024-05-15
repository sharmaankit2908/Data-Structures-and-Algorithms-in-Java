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
    public static Node<Integer> Reverse(Node<Integer> head) {
        if (head==null || head.next==null){
            return head;
        }
        Node<Integer> smallhead=Reverse(head.next);
        Node<Integer> tail_reversed=head.next;
        tail_reversed.next=head;  
        head.next=null;
        return smallhead;
    }
        

	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		//Your code goes here
        if (head==null || head.next==null || k==0){
            return head;
        }
        int l=0;
        Node<Integer>  temp=head;
        while (temp !=null){
            temp=temp.next;
            l++;
        }
        if (l<=k){
            return Reverse(head);
        }
        temp=head;
        int n=1;
        while (n<k){
            temp=temp.next;
            n++;
        }
        Node<Integer> head2=temp.next;
        temp.next=null;
        Node<Integer>  small_ans=Reverse(head);
        Node<Integer>  temp3=small_ans;
        // while (temp3.next !=null){
        //     temp3=temp3.next;
        // }
        head.next=kReverse(head2, k);
        return small_ans;
	}

}