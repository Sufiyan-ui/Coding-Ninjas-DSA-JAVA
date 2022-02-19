package linkedlist_2;

public class Solution4 {
	//	Delete Node Recursive

	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(pos == 0)
            return head.next;
        
        if(head.next == null){
        	return head;    
        }
        
        head.next = deleteNodeRec(head.next, pos-1);
        return head;
	}
}
