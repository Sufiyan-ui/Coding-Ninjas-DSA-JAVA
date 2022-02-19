package linkedlist_1;

public class Solution2 {
	//	Print ith Node
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        if(head == null)
            return;
        
        while(head != null){
            
            if(i == 0){
                System.out.println(head.data);
                break;
            }
            i--;
            head = head.next;
        }
	}
}
