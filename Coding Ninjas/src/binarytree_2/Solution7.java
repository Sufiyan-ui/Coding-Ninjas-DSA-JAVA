package binarytree_2;

public class Solution7 {

	// Level Order Traversal
	

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) return;
        
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                BinaryTreeNode<Integer> node = q.poll();
                
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                
                System.out.print(node.data+" ");
            }
            System.out.println();
        }
	}
	
}
