package binarytree;

public class Solution2 {
	//	find node
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    if(root == null)
            return false;
        
        return (root.data == x || isNodePresent(root.left, x) || isNodePresent(root.right, x));
	}
}
