package linkedlist_2;

public class Solution6 {
	// Find a node in LL recursion
	 
		public static int findNodeRec(LinkedListNode<Integer> head, int n) {
	    	//Your code goes here
	        return find(head, 0, n);
		}
	    
	    public static int find(LinkedListNode<Integer> head, int in,int n){
	        
	        if(head == null)
	            return -1;
	        
	        if(head.data == n)
	            return in;
	        
			return find(head.next, in+1, n);
	    }
}
