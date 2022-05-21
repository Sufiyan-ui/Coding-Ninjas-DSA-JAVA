package priorityQueue_2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> ans = new ArrayList<>();
        if(input == null || input.length == 0)
            return ans;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int i;
        for(i=0; i<k; i++){
            pq.add(input[i]);
        }
        
        for(; i<input.length; i++){
            int temp = pq.peek();
            if(input[i] > temp){
                pq.remove();
                pq.add(input[i]);
            }
        }
        
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        
        return ans;
	}

}
