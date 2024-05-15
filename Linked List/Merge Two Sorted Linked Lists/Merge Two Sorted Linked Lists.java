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
    
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here

        if (head1==null && head2==null){
            return head1;
        }
        else if (head1==null && head2 !=null){
            return head2;
        }
        else if (head1 !=null && head2==null){
            return head1;
        }
        else{
            Node<Integer> temp1=head1;
            Node<Integer> temp2=head2;
            Node<Integer> final_head;
            if (temp1.data <temp2.data){
                final_head=temp1;
                temp1=temp1.next;
            }
            else {
                final_head=temp2;
                temp2=temp2.next;
            }
            Node<Integer> temp3=final_head;

            while (temp1 !=null && temp2 !=null){
                if (temp1.data < temp2.data){
                    temp3.next=temp1;
                    temp3=temp3.next;
                    temp1=temp1.next;
                }
                else {
                    temp3.next=temp2;
                    temp3=temp3.next;
                    temp2=temp2.next;
                }
            }
            
            if (temp1 !=null){
                temp3.next=temp1;
            }

            if (temp2 !=null){
                temp3.next=temp2;
            }
            return final_head;
            
        }
    }

}