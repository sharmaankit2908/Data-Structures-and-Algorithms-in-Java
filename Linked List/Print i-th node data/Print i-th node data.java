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

    public static void printIthNode(Node<Integer> head, int i){
		Node<Integer>  temp=head;
		int count=1;
		while (temp !=null){
			if (count==i){
				if (temp.next !=null){
					System.out.println(temp.next.data);
					break;
				}
			}
			temp=temp.next;
			count++;
		} 
    }
}