public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;

    public BinarySearchTree() {
        root = null;
    }

    public BinaryTreeNode<Integer> insert_helper(BinaryTreeNode<Integer> root, int data) {
        //Implement the insert() function
        if (root == null) {
            BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(data);
            return ans;
        }
        if (root.data >= data) {
            root.left = insert_helper(root.left, data);
        } 
		else{
            root.right = insert_helper(root.right, data);
        }
        return root;
    }

    public int smallest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(smallest(root.right), smallest(root.left)));
    }

	public BinaryTreeNode<Integer> remove_helper(int data, BinaryTreeNode<Integer> root) {
		//Implement the remove() function
		if(root==null){
			return null;
		}

		if(data < root.data){
			root.left= remove_helper(data, root.left);
			return root;
		}else if(data > root.data){
			root.right= remove_helper(data, root.right);
			return root;
		}else{
			if(root.left == null && root.right== null){
				return null;
			}else if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}else{
				BinaryTreeNode<Integer> minNode= root.right;
				while(minNode.left != null){
					minNode= minNode.left;
				}
				root.data =minNode.data;
				root.right= remove_helper(minNode.data, root.right );
				return root;
			}

    public void printTree_helper(BinaryTreeNode<Integer> root) {
        //Implement the printTree() function
        if (root == null) {
            return;
        }
        System.out.print(root.data+":");
        if (root.left != null) {
            System.out.print("L:" + root.left.data+",");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        }
        System.out.println();
        printTree_helper(root.left);
        printTree_helper(root.right);
    }

    public boolean search_helper(BinaryTreeNode<Integer> root, int data) {
        //Implement the search() function
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        } 
		else if (root.data < data) {
            return search_helper(root.right, data);
        } 
		else {
            return search_helper(root.left, data);
        }
    }

    public void insert(int data) {
        //Implement the insert() function
        root = insert_helper(root, data);
    }

    public void remove(int data) {
        //Implement the remove() function
        root=remove_helper(root, data);
    }

    public void printTree() {
        //Implement the printTree() function
        printTree_helper(root);
    }

    public boolean search(int data) {
        //Implement the search() function
        return search_helper(root, data);
    }

}