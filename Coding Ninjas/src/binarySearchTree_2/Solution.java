package binarySearchTree_2;

public class Solution {

	// Find Path in BST

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root == null)
            return new ArrayList<Integer>();
        
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        
        
        if(data < root.data){
            ArrayList<Integer> leftPath = getPath(root.left, data);
            if(!leftPath.isEmpty())
                leftPath.add(root.data);
            return leftPath;
        }else if(data > root.data){
            ArrayList<Integer> rightPath = getPath(root.right, data);
            if(!rightPath.isEmpty())
                rightPath.add(root.data);
            return rightPath;
        }else{
            return new ArrayList<>();
        }
	}
}
