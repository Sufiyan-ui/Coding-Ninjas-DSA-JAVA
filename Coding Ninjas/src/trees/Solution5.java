package trees;

public class Solution5 {
	//	count leaves
	public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null)
            return 0;
        
        int count = 0;
        if(root.children.size() == 0)
            count++;
        for(int i=0; i<root.children.size(); i++){
            int child = countLeafNodes(root.children.get(i));
            count += child;
        }
     return count;   
    }
}
