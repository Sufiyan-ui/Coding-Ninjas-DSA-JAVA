package binarytree;

public class Solution5 {
//	pre order traversal
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}
}