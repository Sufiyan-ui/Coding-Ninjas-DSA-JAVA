package trees;

public class Solution3 {
		//	no of nodes greater than x
	public static int numNodeGreater(TreeNode<Integer> root,int x){	
        if(root == null)  return 0;
        
        int count = 0;
        if(root.data > x)
            count++;
        for(int i=0; i<root.children.size(); i++){
            int child = numNodeGreater(root.children.get(i), x);
            count += child;
        }
        return count;
	}
}
