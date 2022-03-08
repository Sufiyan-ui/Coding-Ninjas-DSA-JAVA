package binarySearchTree_2;

public class Solution5 {

	// Pair Sum in Binary Tree
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
        if(root == null)
            return;
        ArrayList<Integer> al = new ArrayList<>();
        pairSum(root, sum, al);
        Collections.sort(al);
        
        int i = 0;
        int j = al.size()-1;
        
        while(i < j){
            if(al.get(i) + al.get(j) == sum){
                System.out.println(al.get(i)+" "+al.get(j));
                j--;
            }else if(al.get(i) + al.get(j) > sum){
                j--;
            }else{
                i++;
            }
        }
	}
    
    static void pairSum(BinaryTreeNode<Integer> root,int sum, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        
        al.add(root.data);
        pairSum(root.left, sum, al);
        pairSum(root.right, sum, al);
    }
}
