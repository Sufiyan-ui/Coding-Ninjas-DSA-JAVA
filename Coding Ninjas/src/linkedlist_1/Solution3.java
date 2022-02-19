package linkedlist_1;

public class Solution3 {
	//	Delete Node in LinkedList
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        if(head == null)
            return head;
        
        if(pos == 0)
            return head.next;
        
        if(pos < 0)
            if(head.next != null && head.next.next != null) head.next = head.next.next;
        	else
                head.next = null;
        
        LinkedListNode<Integer> temp = head;
        int i = 0;
        while(temp != null){
            if(i == pos-1){
                if(temp.next != null && temp.next.next != null){
                    temp.next = temp.next.next;
                    break;
                }else{
                    temp.next = null;
                    break;
                }
            }
            temp = temp.next;
            i++;
        }
        return head;
	}
}
