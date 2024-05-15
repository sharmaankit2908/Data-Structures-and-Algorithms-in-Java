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
	public static int findNodeRec(Node<Integer> head, int n,int pos) {
    	//Your code goes here
        if (head==null){
            return -1;
        }
        else if (head.data==n){
            return pos;
        }
        return (findNodeRec(head.next, n,pos+1));
       
    }


	public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
        return findNodeRec(head, n,0);
	}

}