package test2;

public class Solution3 {
	//	delete alternate nodes
	 public static void deleteAlternateNodes(Node<Integer> head) {
	        if(head == null || head.next == null)
	            return;
	        
	        Node<Integer> temp = head;
	        while(temp != null){
	            if(temp.next != null)
	            temp.next = temp.next.next;
	            
	            temp = temp.next;
	        }
	        
	        if(temp != null && temp.next != null){
	            temp.next = null;
	        }
	    }
}
