package linkedlist_1;

public class Solution5 {
	//	Append Last Node to First

    private static int len(LinkedListNode<Integer> head){
        if(head == null)
            return 0;
        
        return 1 + len(head.next);
    }
    
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        int size = len(head);
        
        if(n <= 0)
            return head;
        
        if(n > size)
            return null;
        
        int i=1;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> temp = head;
        while(temp.next!=null){
            if(i == size-n){
                tail = temp;
            }
            if(i == size-n+1){
                newHead = temp;
            }
            temp = temp.next;
            i = i+1;
        }
        tail.next = null;
        temp.next = head;
        
        return newHead;
	}
}
