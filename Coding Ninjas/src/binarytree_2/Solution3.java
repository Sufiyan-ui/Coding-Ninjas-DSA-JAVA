package binarytree_2;

public class Solution3 {

	// Construct Binary Tree using preoder and inorder
	
	public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in) {
		return buildTreeHelper(pre, in, 0, pre.length-1, 0, in.length-1);
	}
    
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] pre, int[] in, int preStart, int preEnd,
                                                           int inStart, int inEnd){
        if(inStart > inEnd)
            return null;
        
        if(inStart == inEnd)
            return new BinaryTreeNode<Integer>(in[inStart]);
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preStart]);
        
        int i;
        for(i = inStart; i <= inEnd; i++)
            if(in[i] == pre[preStart])
                break;
        
        int numsLeft = i - inStart;
        
        root.left = buildTreeHelper(pre, in, preStart+1, preStart+numsLeft, inStart, i-1);
        root.right = buildTreeHelper(pre, in, preStart+numsLeft+1, preEnd, i+1, inEnd);
        
        return root;
    }
}
