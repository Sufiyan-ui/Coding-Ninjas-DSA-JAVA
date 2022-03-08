package binarySearchTree_2;

public class Solution3 {

	// LCA of Binary Binary Tree

public class Solution {

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root == null)
            return -1;
        
        if(root.data == a && root.data == b)
            return root.data;
       
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        getPath(root, a, a1);
        getPath(root, b, a2);
        
        int i = 0;
        while(i < a1.size() && i < a2.size()){
            if(a1.get(i) != a2.get(i)){
                break;
            }else
            	i++;
        }
        
        return a1.get(i-1);
	}
    
    private static boolean getPath(BinaryTreeNode<Integer> root, int data, ArrayList<Integer> list){
        
        if(root == null)
            return false;
        
        list.add(root.data);
        
        if(root.data == data){
            return true;
        }
        
        if(getPath(root.left, data, list) || getPath(root.right, data, list)){
            return true;
        }
        
        list.remove(list.size()-1);
        return false;
    }

}
}
