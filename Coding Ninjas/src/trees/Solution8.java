package trees;

public class Solution8 {
	
	//	node having sum of children and maximum
	
	static int maxsum=0;
    static TreeNode<Integer> node=null;
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        int sum = root.data;
        for(TreeNode<Integer> child : root.children)
            sum += child.data;
        
        if(sum > maxsum){
            maxsum = sum;
            node = root;
        }
        
      for(TreeNode<Integer> child : root.children){
          maxSumNode(child);
      }
        return node;
	}	
}
