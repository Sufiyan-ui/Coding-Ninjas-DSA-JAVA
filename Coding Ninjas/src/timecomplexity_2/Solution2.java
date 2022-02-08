package timecomplexity_2;

public class Solution2 {
	//	duplicate in array

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        int k = arr[0];
        for(int i=1; i<arr.length; i++){
            if(k != arr[i]){
                k = arr[i];
            }else{
                break;
            }
        }
        return k;
	}
}
