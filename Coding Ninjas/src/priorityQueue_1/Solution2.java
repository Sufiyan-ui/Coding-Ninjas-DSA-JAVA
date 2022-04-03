package priorityQueue_1;

public class Solution2 {
	// get max
	int getMax()
    {
		// Implement the getMax() function here
        if(isEmpty())
        {
        	return Integer.MIN_VALUE;
      	}
        
      	return heap.get(0);
	}
}
