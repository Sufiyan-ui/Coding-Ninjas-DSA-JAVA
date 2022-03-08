package binarySearchTree;

public class Solution5 {

	// BST to Sorted LinkedList
	
    static LinkedListNode<Integer> head = null, tail = null;

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if(root == null)
            return null;
        
        constructLinkedList(root.left);
        if(root != null){
            if(head == null){
                head = tail = new LinkedListNode<Integer>(root.data);
            }
            else{
                tail.next = new LinkedListNode<>(root.data);
                tail = tail.next;
            }
        }
        constructLinkedList(root.right);
        return head;
	}
}
