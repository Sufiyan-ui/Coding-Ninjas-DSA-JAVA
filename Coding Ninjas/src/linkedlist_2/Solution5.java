package linkedlist_2;

public class Solution5 {
	//	Reverse LL iterative

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> cur, prev, next;
        cur = head;
        prev = null;
        
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
	}
}
