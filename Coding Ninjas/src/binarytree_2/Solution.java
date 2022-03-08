package binarytree_2;

public class Solution {

	// Diameter of a Binary Tree
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null)
            return 0;
        
        int max = 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        max = Math.max(ld+rd, max);
        
        
        return 1 + Math.max(max, Math.max(ld, rd));
	}
	
    private static int height(BinaryTreeNode<Integer> root){
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return 1 + Math.max(lh,rh);
    }
}
