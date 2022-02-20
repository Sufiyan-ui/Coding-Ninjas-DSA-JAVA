package queues;

public class Solution3 {
		//	Reverse the first k in the queue

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        if(input.size() <= 1 || k <= 1)
            return input;
        
        int i = 0;
        k = k%input.size();
        
        Stack<Integer> st = new Stack<>();
        
        while(i < k){
            st.push(input.poll());
            i++;
        }
        
        while(!st.isEmpty()){
            input.offer(st.pop());
        }
        
        for(int j=0; j<input.size()-k; j++){
            input.offer(input.poll());
        }
        return input;
	}
}
