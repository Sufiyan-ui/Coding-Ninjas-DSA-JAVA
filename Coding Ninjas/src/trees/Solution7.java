package trees;

public class Solution7 {

	//	check if generic tree contains element x
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root == null)
            return false;
        
        boolean ans = false;
        if(root.data == x)
            ans = true;
        for(int i=0; i<root.children.size(); i++){
            boolean child = checkIfContainsX(root.children.get(i), x);
            ans = (ans || child);
        }
        return ans;
	}
	
}
