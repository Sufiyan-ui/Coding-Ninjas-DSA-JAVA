package binarytree;

public class Solution10 {
	//	nodes without siblings
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root == null)
            return;
        
        if(root.left != null && root.right == null)
            System.out.print(root.left.data+" ");
        if(root.left == null && root.right != null)
            System.out.print(root.right.data+" ");
        
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}

}
