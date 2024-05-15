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

	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		//Your code goes here
        if (i==j){
            return head;
        }
        Node<Integer> len=head;
        int l=0;
        while (len.next.next !=null){
            len=len.next;
            l++;
        }
        if (i==0 && j==l+1){
            Node<Integer> c1 =head;
            Node<Integer> p2=len;
            Node<Integer> c2=len.next;

            // p1.next=c2;
            p2.next=c1;
            Node<Integer>  t2=c1.next;
            c1.next=null;
            c2.next=t2;
            head=c2;
            return head;


            // return head;
        }
        
        int m1=Math.min(i, j);
        int m2=Math.max(i,j);
        i=m1;
        j=m2;
        Node<Integer> temp1=head;
        int i1=1;
        while (i1 < i){
            temp1=temp1.next;
            i1++;       
        }
        Node<Integer> p1=temp1;
        Node<Integer> c1=temp1.next;
        Node<Integer> temp2=c1;


        while (i1< j-1){
            temp2=temp2.next;
            i1++;
        }
        Node<Integer> p2=temp2;
        Node<Integer> c2=temp2.next;
        

        p1.next=c2;
        p2.next=c1;
        Node<Integer>  t2=c1.next;
        c1.next=c2.next;
        c2.next=t2;


        return head;
	}

}