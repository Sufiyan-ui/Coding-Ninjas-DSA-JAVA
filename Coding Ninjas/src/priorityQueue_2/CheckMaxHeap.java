package priorityQueue_2;

public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		if(arr == null || arr.length == 0)
            return true;
        // return checkMaxHeap(arr, 0);
        for(int i = arr.length-1; i>= 0; i--){
            int childIndex = i;
            int parentIndex = (i-1)/2;
            while(childIndex > 0){
                if(arr[childIndex] < arr[parentIndex]){
                    childIndex = parentIndex;
                    parentIndex = (childIndex-1)/2;
                }else
                    return false;
            }
        }
        return true;
	}
    
}
