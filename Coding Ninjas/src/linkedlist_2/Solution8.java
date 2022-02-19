package linkedlist_2;

public class Solution8 {
	// Delete every n node in LL

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> finalHead, tail=null;
        finalHead = tail;
        while(temp != null){
            int x = M;
            while(x > 0 && temp != null){
                if(finalHead == null){
                    finalHead = tail = temp;
                }else{
                    tail.next = temp;
                    tail = tail.next;
                }
				x--;
                temp = temp.next;
            }
            int y = N;
            while(y > 0 && temp != null){
            	temp = temp.next;
                y--;
            }
        }
        
        if(tail!=null && tail.next != null)
            tail.next = null;
            
        return finalHead;
	}
}
