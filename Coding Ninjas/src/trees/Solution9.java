package trees;

public class Solution9 {
	
	//		structurally identical
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        boolean ans = false;
        if(root1.data == root2.data && root1.children.size() == root2.children.size()){
            ans = true;
        for(int i=0; i<root1.children.size(); i++){
            boolean child = checkIdentical(root1.children.get(i),root2.children.get(i));
            ans = (ans && child);
        	}
        }
        return ans;
	}
}
