package trees;

public class Solution {
	//	print levelwise
	public static void printLevelWise(TreeNode<Integer> root){
		if(root == null)
            return;
        
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
            	TreeNode<Integer> node = q.poll();
                	System.out.print(node.data+" ");
                for(int j=0; j<node.children.size(); j++){
                    TreeNode<Integer> child = node.children.get(j);
                    q.offer(child);
                }
            }
            System.out.println();
        }
	}
}
