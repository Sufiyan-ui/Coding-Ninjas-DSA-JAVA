package binarytree;

public class Solution8 {
//	build tree using inorder and postorder
	public static BinaryTreeNode<Integer> buildTree(int[] postorder, int[] inorder) {
		HashMap<Integer, Integer> inMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        
        BinaryTreeNode<Integer> root = buildTree(inorder, 0, inorder.length-1,
                                  postorder, 0, postorder.length-1, inMap);
            
		return root;
	}
    
    private static BinaryTreeNode<Integer> buildTree(int[] in, int inStart, int inEnd,
                               int[] post, int postStart, int postEnd,
                               HashMap<Integer, Integer> inMap){
        
        if(inStart > inEnd || postStart > postEnd) return null;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(post[postEnd]);
        
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;
        
        root.left = buildTree(in, inStart, inRoot - 1, post, postStart, postStart + numsLeft - 1, inMap);
            
        root.right = buildTree(in, inRoot + 1, inEnd, post, postStart + numsLeft, postEnd - 1, inMap);
            
        return root;    
    }
}
