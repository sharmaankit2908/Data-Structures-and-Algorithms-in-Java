   
import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    //Define the data members
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    //int size;



    public Stack() {
        //Implement the Constructor

        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        // size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return queue1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return queue1.isEmpty(); //we have to implement isEmpty function here
    }

    public void push(int element) {
        //Implement the push(element) function
        queue1.add(element);


    }

    public int pop() {
        //Implement the pop() function
        if (queue1.isEmpty())
            return -1;
        
        while (queue1.size() > 1) { 
            queue2.add(queue1.remove()); //corrected loop updating
        }
        int ans=queue1.remove();

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
      
        return ans;
    }

    public int top() {
        //Implement the top() function
        if (queue1.isEmpty())
            return -1;
        
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());//corrected loop updation
        }
        int ans=queue1.remove();

        queue2.add(ans);

        //Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return ans;
    }
}