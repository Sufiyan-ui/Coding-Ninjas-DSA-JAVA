package binarytree_2;

public class Solution6 {
	
	// Minimum and Maximum in Binary Tree
	

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        if(root == null){
            return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.right);
		
		int min = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
		int max = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));
                                                       
        return new Pair(min, max);
	}

}
