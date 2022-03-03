package binarytree;

public class Solution4 {
	//	mirror a binary tree
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root == null)
            return;
     	
        BinaryTreeNode<Integer> left = root.left;
        BinaryTreeNode<Integer> right = root.right;
        root.left = right;
        root.right = left;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
}
