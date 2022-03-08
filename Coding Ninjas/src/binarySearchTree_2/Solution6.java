package binarySearchTree_2;

public class Solution6 {

	// Path Sum Root to Leaf

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		if(root == null){
            return;
        }
        
        helper(root, "", k);
	}
    
    private static void helper(BinaryTreeNode<Integer> root, String s, int k){
        if(root == null || k < 0)
            return;
        
        if(root.left == null && root.right == null){
            if(k == root.data){
                System.out.println(s+root.data);
            }
        }
        
        s += root.data + " ";
        
		helper(root.left, s, k - root.data);
		helper(root.right, s, k - root.data);
    }
}
