package binarytree;

public class Solution7 {
	
	//	build tree using inorder and preorder
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return buildTreeHelper(0, preOrder.length-1, preOrder, 0, inOrder.length-1, inOrder);
	}
    
    private static BinaryTreeNode<Integer> buildTreeHelper(int sip, int endp, int[] pre, int sii, int endi, int[] in){
        if(sii > endi)
            return null;
        
        if(sii == endi)
            return new BinaryTreeNode<Integer>(in[sii]);
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[sip]);
        int i;
        
        for(i=sii; i<= endi; i++)
            if(in[i] == pre[sip])
                break;
        
        int numsLeft = i - sii;
        
        root.left = buildTreeHelper(sip+1, sip + numsLeft, pre, sii, i-1, in);
        root.right = buildTreeHelper(sip + numsLeft + 1, endp, pre, i+1, endi, in);
        
        return root;
    }
}
