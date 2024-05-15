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
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		//Your code goes here
        if (head==null || N==0){
            return head;
        }
        if (M==0){
            Node<Integer> ans=null;
            return ans;
            
        }
        Node<Integer> temp1=head;
        while (temp1 !=null){
            int m1=1;
            while (temp1 !=null && m1<M){
                temp1=temp1.next;
                m1++;
            }
            if (temp1==null){
                return head;
            }
            int n1=0;
            Node<Integer> temp2=temp1.next;
            while (temp2 !=null && n1<N){
                temp2=temp2.next;
                n1++;
            }
            if (temp2==null){
                temp1.next=null;
                return head;
            }
            temp1.next=temp2;
            temp1=temp2;
        }  
        return head; 
	}
}