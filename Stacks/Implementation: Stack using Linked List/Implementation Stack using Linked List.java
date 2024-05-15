
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

public class Stack {

    //Define the data members
    private Node head;
    private int size;


    public Stack() {
        //Implement the Constructor
        head=null;
        size=0;

    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return this.size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if ( this.size !=0){
            return false;
        }
        return true;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node new_node=new Node(element);
        if (this.size==0){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
        this.size +=1;


    }

    public int pop() {
        //Implement the pop() function
        if (this.size ==0){
            return -1;
        }
        int c=head.data;
        head=head.next;
        this.size -=1;
        return c;
    }

    public int top() {
        //Implement the top() function
        if (this.size ==0){
            return -1;
        }
        int c=head.data;
        return c;
    }
}