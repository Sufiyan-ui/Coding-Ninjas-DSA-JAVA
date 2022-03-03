package trees;

public class Solution4 {
	
		//	find height
	
	public static int getHeight(TreeNode<Integer> root){
        if(root == null)
            return 0;
        
        int max_height = 0;
        for(int i=0; i<root.children.size(); i++){
            max_height = Math.max(max_height, getHeight(root.children.get(i)));
        }
        return 1 + max_height;
	}
}
