

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
		static TreeNode<Integer> max;
    static TreeNode<Integer> secmax;

 public static void helper(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        if (root.data > max.data) {
            secmax = max;
            max = root;
        } else if (root.data < max.data && root.data > secmax.data) {
            secmax = root;
        }

        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
        max = new TreeNode<>(Integer.MIN_VALUE);
        secmax = new TreeNode<>(Integer.MIN_VALUE);
        helper(root);
        return secmax.data != Integer.MIN_VALUE ? secmax : null;
    }
	
	
}
