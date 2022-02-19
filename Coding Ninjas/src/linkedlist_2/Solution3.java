package linkedlist_2;

public class Solution3 {
	//	MergeSort LL

    private static LinkedListNode<Integer> mid(LinkedListNode<Integer> head){
        if(head == null)
            return head;
        
        LinkedListNode<Integer> s = head;
        LinkedListNode<Integer> f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    private static LinkedListNode<Integer> merge(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2){
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l2.data < l1.data){
            LinkedListNode<Integer> tmp = l1;
            l1 = l2;
            l2 = tmp;
		}
        
        LinkedListNode<Integer> res = l1;
        
        while(l1 != null && l2 != null){
            LinkedListNode<Integer> temp = null;
            while(l1 != null && l1.data <= l2.data){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            
            // swap nodes
            LinkedListNode<Integer> tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        return res;
    }
    
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null)
            return head;
        
            LinkedListNode<Integer> m = mid(head);
            LinkedListNode<Integer> h2 = m.next;
            m.next = null;
            LinkedListNode<Integer> fs = mergeSort(head);
            LinkedListNode<Integer> ss = mergeSort(h2);
            LinkedListNode<Integer> ans = merge(fs, ss);
            return ans;
	}
}
