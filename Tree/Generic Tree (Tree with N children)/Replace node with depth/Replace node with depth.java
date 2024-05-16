import java.util.LinkedList;

import java.util.Queue;

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		if (root==null){
			return;
		}
		Queue<TreeNode<Integer>> q1=new LinkedList<>();
		Queue<TreeNode<Integer>> q2=new LinkedList<>();
		q1.add(root);
		int count=0;
		while (!q1.isEmpty() || !q2.isEmpty()){
			while (!q1.isEmpty()){
				TreeNode<Integer> front=q1.poll();
				front.data=count;
				for (int i=0;i<front.children.size();i++){
					q2.add(front.children.get(i));
				}
			}
			count++;
			while (!q2.isEmpty()){
				TreeNode<Integer> front=q2.poll();
				front.data=count;
				for (int i=0;i<front.children.size();i++){
					q1.add(front.children.get(i));
				}
			}
			count++;
		}		
	}
	
	
}
