package binarytree;

public class Solution {
	// print level order traversal
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null)
            return;
        
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                BinaryTreeNode<Integer> temp = q.poll();
				System.out.print(temp.data+":");
                if(temp.left != null){
                    q.offer(temp.left);
                    System.out.print("L:"+temp.left.data+",");
                }else{
                    System.out.print("L:-1,");
                }
                if(temp.right != null){
                    q.offer(temp.right);
                    System.out.print("R:"+temp.right.data);
                }else{
                    System.out.print("R:-1");
                }
            System.out.println();
            }
        }
	}
}
