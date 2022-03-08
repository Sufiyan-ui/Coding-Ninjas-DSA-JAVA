package binarytree_2;

public class Solution5 {

	// Create and Insert Duplicate Node

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null) 
            return;
        
        insertDuplicateNode(root.right);
        insertDuplicateNode(root.left);
        
        if(root.left != null){
            BinaryTreeNode<Integer> temp = root.left;
            BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(root.data);
            root.left = left;
            left.left = temp;
        }
        else{
            root.left = new BinaryTreeNode<Integer>(root.data);
        }
	}
	
}
