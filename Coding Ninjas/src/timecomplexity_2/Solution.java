package timecomplexity_2;

public class Solution {
	//	find unique element

	public static int findUnique(int[] arr) {
		//Your code goes here
        int k = arr[0];
        for(int i=1; i<arr.length; i++){
            k ^= arr[i];
        }
        return k;
	}
}
