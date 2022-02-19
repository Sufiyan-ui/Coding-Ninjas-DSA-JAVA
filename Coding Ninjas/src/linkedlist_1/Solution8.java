package linkedlist_1;

public class Solution8 {
	//	Palindrome LinkedList

    private static LinkedListNode<Integer> middleNode(LinkedListNode<Integer> head){
        if(head == null)
            return head;
        
        LinkedListNode<Integer> slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    private static LinkedListNode<Integer> rev(LinkedListNode<Integer> head){
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> next;
        LinkedListNode<Integer> cur = head;
        
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    private static int len(LinkedListNode<Integer> head){
        if(head == null)
            return 0;
        return 1+len(head.next);
    }
    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return true;
        
        LinkedListNode<Integer> m = middleNode(head);
        
        if(len(head)%2 == 1)
            m = m.next;
        
        LinkedListNode<Integer> r = rev(m);
        
        while(r != null){
            if(r.data != head.data){
                return false;
            }else{
                head = head.next;
                r = r.next;
            }
        }
        
        return true;
	}
}
