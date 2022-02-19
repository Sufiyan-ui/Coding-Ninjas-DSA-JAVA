package linkedlist_2;

public class Solution2 {
	//	Merge two sorted LL

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        
        LinkedListNode<Integer> t1, t2, finalHead;
        if(head1.data < head2.data){
            t1 = head1;
            t2 = head2;
        }else{
            t1 = head2;
            t2 = head1;
        }
        
        finalHead = t1;
        
        while(t1!=null && t2!=null){
            LinkedListNode<Integer> temp = null;
            while(t1 != null && t1.data <= t2.data){
                temp = t1;
                t1 = t1.next;
            }
            temp.next = t2;
            
            //	swap nodes
            LinkedListNode<Integer> tmp = t1;
            t1 = t2;
            t2 = tmp;
        }
        return finalHead;
    }
}
