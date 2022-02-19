package linkedlist_2;

public class Solution {
	//	Find mid point in Linked List

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null)
            return head;
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        
        while(slow.next != null 
              && fast.next != null 
              && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
