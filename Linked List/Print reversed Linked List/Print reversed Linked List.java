

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
	public static void print(Node<Integer> root){
		if (root ==null){
			return;
		}
		if (root.next==null){
			System.out.print(root.data+" ");
			return;
		}
		System.out.print(root.data+" ");
		print(root.next);
	}

	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if (root == null){
			return;
		}
		else if (root.next==null){
			System.out.println(root.data);
			return;
		}
		else {
			Node<Integer> prev=null;
			Node<Integer> curr=root;
			Node<Integer> next=root;
			while (curr !=null){
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			root=prev;
			print(root);
			
			// Node<Integer> temp=root;
			// while (temp !=null){
			// 	System.out.print(temp.data+" ");
			// 	temp=temp.next;
			// }
		}
	}

}