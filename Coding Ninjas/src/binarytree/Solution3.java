package binarytree;

public class Solution3 {
	// height of a binary tree
	public static int height(BinaryTreeNode<Integer> root) {
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return 1 + Math.max(lh, rh);
	}
}
