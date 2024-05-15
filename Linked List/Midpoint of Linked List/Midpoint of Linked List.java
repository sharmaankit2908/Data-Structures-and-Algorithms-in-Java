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
    
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null){
            return head;
        }
        int l=0;
        Node<Integer> temp=head;
        while (temp !=null){
            temp=temp.next;
            l++;
        }
        int mid;
        if (l%2==0){
            mid=(l/2)-1; 
        }
        else{
            mid=l/2;
        }
        if (mid==0){
            Node<Integer> newnode=new Node<>(head.data);
            return newnode;

        }
        else{
            int count=0;
            temp=head;
            while (count < (mid-1)){
                temp=temp.next;
                count +=1;
            }
            Node<Integer> newnode=new Node<>(temp.next.data);
            return newnode;
        }

    }

}