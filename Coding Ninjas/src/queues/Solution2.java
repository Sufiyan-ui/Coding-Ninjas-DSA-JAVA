package queues;

public class Solution2 {
	//	Reverse Queue (Recursive Solution)

	public static void reverseQueue(Queue<Integer> input) {
		if(input.size() <= 1)
            return;
        
		int val = input.poll();
		reverseQueue(input);
		input.offer(val);
	}
}
