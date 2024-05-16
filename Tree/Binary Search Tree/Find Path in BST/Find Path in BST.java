import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */
	public static boolean ifexist(BinaryTreeNode<Integer> root, int data){
		if (root==null){
			return false;
		}
		if (root.data<data){
			return ifexist(root.right, data);
		}
		else if (root.data>data){
			return ifexist(root.left, data);
		}
		else{
			return true;
		}
	 }
	
	public static ArrayList<Integer> helper(BinaryTreeNode<Integer> root, int data,ArrayList<Integer> ans){
		if (root.data==null){
			return ans;
		}
		if (root.data<data){
			ans.add(root.data);
			return helper(root.right, data,ans);
		}
		else if (root.data>data){
			ans.add(root.data);
			return helper(root.left, data,ans);
		}
		else{
			ans.add(root.data);
			return ans;
		}

	}

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/

		boolean exist=ifexist(root, data);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		if (exist==false){
			return ans;
		}
		else{
			ans=helper(root, data, ans);
		}
		ArrayList<Integer> final_ans=new ArrayList<Integer>();
		int n=ans.size();
		for (int i=0;i<ans.size();i++){
			final_ans.add(ans.get(n-i-1));
		}
		return final_ans;

	}
}