package priorityQueue_2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        if(input.size() == 0)
            return ans;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ArrayList<Integer> arr: input){
            for(int it: arr){
                pq.add(it);
            }
        }
        
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
	}
}
