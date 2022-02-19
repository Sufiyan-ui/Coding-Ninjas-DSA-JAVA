package linkedlist_2;

public class Solution9 {
	//	Swap teo nodes

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
        if((i-j) == 0)
            return head;
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> c1, c2, p1, p2, prev = null;
        c1 = c2 = p1 = p2 = null;
        
        int x = 0;
        while(temp != null){
            if(x == i){
                p1 = prev;
                c1 = temp;
            }else if(x == j){
                p2 = prev;
                c2 = temp;
            }
            prev = temp;
            temp = temp.next;
            x++;
        }
        
        if(p1 != null){
           p1.next = c2;  
        }else{
            head = c2;
        }
        if(p2 != null){
            p2.next = c1;
        }else{
            head = c1;
        }
        LinkedListNode<Integer> temp1=c2.next;
        c2.next=c1.next;
        c1.next=temp1;
        return head;
	}


}
