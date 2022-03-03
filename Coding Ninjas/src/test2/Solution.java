package test2;
/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/
				// next number
public class Solution {

	private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> cur = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next;
        
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        head = reverse(head);
        head = addOneUtil(head);
        return reverse(head);
	}

	static LinkedListNode<Integer> addOneUtil(LinkedListNode<Integer> head){
        LinkedListNode<Integer> res = head;
        LinkedListNode<Integer> temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null){
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if (carry > 0)
            temp.next = new LinkedListNode<Integer>(carry);
        return res;
    }
    
}
