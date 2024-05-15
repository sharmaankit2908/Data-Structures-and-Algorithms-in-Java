/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}46

*/
import java.util.LinkedList;
import java.util.Queue;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
        
        
        if(root == null)
            return;
	 Queue<BinaryTreeNode<Integer>> Q= new LinkedList<BinaryTreeNode<Integer>>();
	 Q.add(root); 
	//while there is at least one discovered node
	while(!Q.isEmpty()) {
        BinaryTreeNode<Integer> front= Q.poll(); // deleting node and collecting it
		System.out.print(front.data+":");
		if(front.left != null) {
            System.out.print("L:"+front.left.data+",");
            Q.add(front.left);
        }
       else
            System.out.print("L:"+"-1"+",");
		if(front.right != null){
            System.out.print("R:"+front.right.data);
            Q.add(front.right);
        }
      else
            System.out.print("R:"+"-1");
        
        System.out.println();
        

        
	 }  
}
        
	}
	