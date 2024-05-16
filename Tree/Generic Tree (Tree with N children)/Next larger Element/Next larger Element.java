import java.util.ArrayList;

import java.util.LinkedList;



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
	public static void greater_nodes(TreeNode<Integer> root, int n, ArrayList<TreeNode<Integer>> list){
		if (root==null){
			return;
		}
		if (root.data>n){
			list.add(root);		
		}
		for (int i=0;i<root.children.size();i++){
			greater_nodes(root.children.get(i), n, list);
		}
	}
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		if (root==null){
			return null;
		}
		ArrayList<TreeNode<Integer>> list=new ArrayList<>();
		greater_nodes(root, n, list);
		if (list.size()==0){
			return null;
		}
		TreeNode<Integer> ans=new TreeNode<Integer>(-1);
		int min=Integer.MAX_VALUE;
		for (int i=0;i<list.size();i++){
			if (list.get(i).data < min){
				min=list.get(i).data;
				ans=list.get(i);
			}
		}
		return ans;
	}
	
}
