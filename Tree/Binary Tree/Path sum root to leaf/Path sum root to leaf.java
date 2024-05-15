import java.util.ArrayList;

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
	}
*/

public class Solution {
	public static void helperrootToLeafPathsSumToK(BinaryTreeNode<Integer> root,ArrayList<Integer> path,int k){
		if (root==null){
			return;
		}
		k=k-root.data;
		path.add(root.data);

		if (root.left==null && root.right==null){
			if (k==0){
				for (int i=0;i<path.size();i++){
					System.out.print(path.get(i)+" ");
				}
				System.out.println();
			}
			path.remove(path.size()-1);
			return;
		}
		helperrootToLeafPathsSumToK(root.left, path, k);
		helperrootToLeafPathsSumToK(root.right, path, k);
		path.remove(path.size()-1);
	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		ArrayList<Integer> path=new ArrayList<>();

		helperrootToLeafPathsSumToK(root, path, k);
		
	}

}