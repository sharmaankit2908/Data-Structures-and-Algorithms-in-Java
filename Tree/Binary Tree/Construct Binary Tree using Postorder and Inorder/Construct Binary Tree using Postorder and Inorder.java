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
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        int n = postOrder.length;
        return buildTreeHelper(postOrder, 0, n - 1, inOrder, 0, n - 1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int postStart, int postEnd,
                                                           int[] inOrder, int inStart, int inEnd) {
        if (postStart > postEnd || inStart > inEnd)
            return null;

        int rootData = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        int k = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootData) {
                k = i;
                break;
            }
        }

        int leftTreeSize = k - inStart;

        root.left = buildTreeHelper(postOrder, postStart, postStart + leftTreeSize - 1,
                                    inOrder, inStart, k - 1);
        root.right = buildTreeHelper(postOrder, postStart + leftTreeSize, postEnd - 1,
                                    inOrder, k + 1, inEnd);

        return root;
    }
}
