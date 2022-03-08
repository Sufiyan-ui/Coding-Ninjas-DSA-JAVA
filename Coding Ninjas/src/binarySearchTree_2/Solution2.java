package binarySearchTree_2;

public class Solution2 {
		
	// BST Class
	
class BinarySearchTree {
    
    private BinaryTreeNode<Integer> root;
    
    private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data);
            return node;
        }    
        
        if(data <= root.data)
           root.left = insert(root.left, data);
        else
           root.right = insert(root.right, data);
        
        return root;
    }
    
	public void insert(int data) {
            root = insert(root, data);
	}
	
    private BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root, int data){
        if(root == null)
            return null;
        
        if(root.data == data){
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left != null && root.right == null){
                return root.left;
            }else if(root.right != null && root.left == null){
                return root.right;
            }else if(root.left != null && root.right != null){
                 BinaryTreeNode<Integer> minNode = root.right;
                    while (minNode.left != null) {
                        minNode = minNode.left;
                    }
                    root.data = minNode.data;
                    root.right = remove(root.right,minNode.data);
                return root;
            }
        }else{
            if(data < root.data){
                root.left = remove(root.left, data);
            }else if(root.data < data){
                root.right = remove(root.right, data);
            }
        }
        return root;
    }
    
    
	public void remove(int data) {
		//Implement the remove() function
            root = remove(root, data);
        
	}
	
    private void printTree(BinaryTreeNode<Integer> root){
        if(root == null)
            return;
        
        System.out.print(root.data+":");
        if(root.left != null)
            System.out.print("L:"+root.left.data+",");
        // else
        //     System.out.print("L:-1,");
        if(root.right != null)
            System.out.print("R:"+root.right.data);
        // else
        //     System.out.print("R:-1");
        
        System.out.println();
        
        printTree(root.left);
        printTree(root.right);
    }
    
	public void printTree() {
		//Implement the printTree() function
        printTree(root);
	}
	
    private boolean search(BinaryTreeNode<Integer> root, int data){
        if(root == null)
            return false;
        
        if(root.data == data)
            return true;
        else if(root.data > data)
            return search(root.left, data);
        else
            return search(root.right, data);
    }
	public boolean search(int data) {
		//Implement the search() function
        return search(root, data);
	}
	

}
}
