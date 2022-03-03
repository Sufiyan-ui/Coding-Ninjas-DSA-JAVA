package trees;

public class Solution10 {
	//	next larger element
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
        if(root == null){
            return root;
        }
        TreeNode<Integer> temp =null;
        TreeNode<Integer> ansNode = null;
        
        if(root.data>n){
    		ansNode = root;
        }
        
        for(int i=0;i<root.children.size();i++){
            temp=findNextLargerNode(root.children.get(i),n);
            if(ansNode != null){
                if(temp != null && temp.data<ansNode.data){
                 ansNode =temp;
                }
            }
            else if(ansNode == null){
                  ansNode = temp;
            }
        }
        return ansNode;
    }
}
