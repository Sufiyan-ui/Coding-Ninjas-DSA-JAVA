package linkedlist_1;

public class Solution4 {
	//	Find a Node in LinkedList

    public static int len(LinkedListNode<Integer> head){
        if(head == null)
            return 0;
        int c =0;
        while(head!=null)
        {
            head = head.next;
            c++;
        }
        return c;
    }
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        if(head == null)
            return -1;
        
        int pos=0;
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            if(temp.data != n){
                temp = temp.next;
                pos++;
            }
            else{
                break;
            }
        }
        
        if(len(head) == pos)
            return -1;
        
        return pos;
	}
}
