package trees;

public class Solution13 {
		//	replace node with depth
	public static void replaceWithDepthValue(TreeNode<Integer> root){
        if(root == null)
            return;
        
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        int depth = -1;
        q.offer(root);
        while(!q.isEmpty()){
            int numLevel = q.size();
            depth++;
            for(int i=0; i<numLevel; i++){
            	TreeNode<Integer> node = q.poll();
                node.data = depth;
                for(int j=0; j<node.children.size(); j++){
                    TreeNode<Integer> child = node.children.get(j);
                    q.offer(child);
                }
            }
        }
	}
}
