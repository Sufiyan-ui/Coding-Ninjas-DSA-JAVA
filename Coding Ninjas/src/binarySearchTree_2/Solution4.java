package binarySearchTree_2;

public class Solution4 {

	// LCA of BST

	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null)
            return -1;
        
        if(root.data == a && root.data == b)
            return root.data;
       
        ArrayList<Integer> a1 = getPath(root, a);
        ArrayList<Integer> a2 = getPath(root, b);
        
        int i = a1.size()-1;
        int j = a2.size()-1;
        while(i >= 0 && j >= 0){
            if(a1.get(i) != a2.get(j)){
                break;
            }else{
            	i--;
                j--;
            }
        }
        
        return a1.get(i+1);
	}
    
    private static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
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
