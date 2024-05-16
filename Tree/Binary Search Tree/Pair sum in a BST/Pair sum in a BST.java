import java.util.ArrayList;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
	
	
	public static void inorder(BinaryTreeNode<Integer> root,ArrayList<Integer> output){
		if (root==null){
			return;
		}
		inorder(root.left,output);
		output.add(root.data);
		inorder(root.right,output);
	}
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		if ((root==null) ||(root.left==null && root.right==null)){
			return;
		}
		ArrayList<Integer> output=new ArrayList<>();
		inorder(root, output);
		int n=output.size();
		int i=0;
		int j=n-1;
		while (i<j){
			if (output.get(i)+output.get(j) < s){
				i++;
			}
			else if (output.get(i)+output.get(j) > s){
				j--;
			}
			else {
				System.out.println(output.get(i)+" "+output.get(j));
				i++;
				j--;
			}
		}	
	}

}