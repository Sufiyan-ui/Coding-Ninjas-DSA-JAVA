package priorityQueue_1;

public class Solution1 {
	// remove min
	int removeMin() throws PriorityQueueException {
        if(isEmpty()){
			// Throw an exception
			throw new PriorityQueueException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int parentindex = 0;
		int minIndex = parentindex;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while(leftChildIndex < heap.size()){

			if(heap.get(leftChildIndex) < heap.get(minIndex)){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
				minIndex = rightChildIndex;
			}
			if(minIndex == parentindex){
				break;
			}else{
				int temp1 = heap.get(parentindex);
				heap.set(parentindex, heap.get(minIndex));
				heap.set(minIndex, temp1);
				parentindex = minIndex;
				leftChildIndex = 2 * parentindex + 1;
				rightChildIndex = 2 * parentindex + 2;
			}
		}
		return temp;
	}
}
