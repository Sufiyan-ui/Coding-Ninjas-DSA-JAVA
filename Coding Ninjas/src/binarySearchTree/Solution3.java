package binarySearchTree;

public class Solution3 {

	// Check If Tree is BST
	

	public static boolean isBST(BinaryTreeNode<Integer> root) {
        return BST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
    
    private static boolean BST(BinaryTreeNode<Integer> root, int min, int max){
        if(root == null)
            return true;
        
        if(root.data <= min || root.data > max)
            return false;
        
        return BST(root.left, min, root.data) && BST(root.right, root.data, max);
    }
}
