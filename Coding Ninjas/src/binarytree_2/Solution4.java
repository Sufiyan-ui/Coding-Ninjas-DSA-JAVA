package binarytree_2;

public class Solution4 {

	// Construct a Binary Tree using postorder ans inorder
	
	public static BinaryTreeNode<Integer> buildTree(int[] post, int[] in) {
		return buildTreeHelper(post, in, 0, post.length-1, 0, in.length-1);
	}
    
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] post, int[] in, int postStart,
                                                           int postEnd, int inStart,int inEnd){
        if(inStart > inEnd)
            return null;
        
        if(inStart == inEnd)
            return new BinaryTreeNode<>(in[inStart]);
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(post[postEnd]);
        int i;
        for(i=inStart; i<=inEnd; i++)
            if(in[i] == post[postEnd])
        		break;
        
        int numsLeft = i - inStart;
        
        root.left = buildTreeHelper( post, in, postStart, postStart + numsLeft - 1, inStart, i - 1);
            
        root.right = buildTreeHelper( post, in, postStart + numsLeft, postEnd - 1, i + 1, inEnd);
            
        return root;
    }
}
