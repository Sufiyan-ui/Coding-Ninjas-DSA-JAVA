package linkedlist_1;

public class Solution {
	// Length of LinkedList
	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        if(head == null)
            return 0;
        
        int count=0;
        while(head != null){
            count++;
            head = head.next;
        }
        
        return count;
	}
}
