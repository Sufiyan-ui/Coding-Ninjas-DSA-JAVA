package priorityQueue_2;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static int kthLargest(int n, int[] arr, int k) {
		// Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int i;
        for(i=0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(; i<arr.length; i++){
            int temp = pq.peek();
            if(temp < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.remove();
	}
}
