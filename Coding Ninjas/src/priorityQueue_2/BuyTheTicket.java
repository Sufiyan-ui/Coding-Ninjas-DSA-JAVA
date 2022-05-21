package priorityQueue_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class BuyTheTicket {

	public static int buyTicket(int input[], int k) {
		
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<input.length;i++){
            pq.add(input[i]);
            q.offer(i);
        }

        int count = 0;
        
        while(q.peek() != k || pq.peek() != input[q.peek()] ){ 
            if(pq.peek() > input[q.peek()]){
               int x = q.peek();
               q.poll();
               q.offer(x);
            }
            else if(pq.peek() == input[q.peek()]){ 
              pq.remove();
              q.poll();
              count++;
            }
		}

        return count+1;
    }
}
