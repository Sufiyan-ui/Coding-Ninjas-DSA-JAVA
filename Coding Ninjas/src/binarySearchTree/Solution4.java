package binarySearchTree;

public class Solution4 {

	// Construct BST from Sorted Array

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        if(n <= 0)
            return null;
		return bst(arr, 0, n-1);
	}

	private static BinaryTreeNode<Integer> bst(int[] ar, int i, int j){
        if(i > j){
            return null;
        }
        
         int mid = (i+j)/2;
         BinaryTreeNode<Integer> root = new  BinaryTreeNode<Integer>(ar[mid]);
         BinaryTreeNode<Integer> left = bst(ar, i, mid-1);
         BinaryTreeNode<Integer> right = bst(ar, mid+1, j);
        root.left = left;
        root.right = right;
        return root;
    }
}
