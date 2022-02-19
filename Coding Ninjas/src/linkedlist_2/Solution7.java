package linkedlist_2;

public class Solution7 {
	//	Even after odd LL

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> cur = head;
        LinkedListNode<Integer> h1, t1, h2, t2;
        h1 = h2 = t1 = t2 = null;
        while(cur != null){
            if(cur.data%2 == 1){
                if(h1 == null){
                    h1 = cur;
                    t1 = cur;
                }else{
                    t1.next = cur;
                    t1 = t1.next;
                }
            }else{
                if(h2 == null){
                    h2 = cur;
                    t2 = cur;
                }else{
                    t2.next = cur;
                    t2 = t2.next;
                }
            }
            cur = cur.next;
        }
        
        if(h1 == null)
            return h2;
        
        if(h2 != null){
            t1.next = h2;
            t2.next = null;
        }
        return h1;
	}
}
