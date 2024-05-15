/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	Node head;
	Node tail;
	int size;
	
	//Define the data members


	public Queue() {
		//Implement the Constructor
		head=null;
		tail=null;
		size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return head==null;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		Node newnode= new Node(data);
		if (head==null){
			head=newnode;
			tail=newnode;
		}
		else{
			tail.next=newnode;
			tail=newnode;
		}
		size +=1;
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if (head==null){
			return -1;
		}
		int m=head.data;
		head=head.next;
		size -=1;
		return m;
    }


    public int front() {
    	//Implement the front() function
		if (head==null){
			return -1;
		}
		return head.data;
    }
}
