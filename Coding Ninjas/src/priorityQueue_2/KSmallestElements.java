package priorityQueue_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElements {

	public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		// Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(arr == null || arr.length == 0)
            return ans;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        int i;
        for(i=0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(; i<arr.length; i++){
            int temp = pq.peek();
            if(arr[i] < temp){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
	}
}
