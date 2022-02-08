package timecomplexity_2;

public class Solution7 {
	//	check array rotation

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        if(arr.length <= 1)
            return 0;
        
        int count=0;
        int k = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= k){
                k = arr[i];
                count++;
            }
            else
                break;
        }
        if(count == arr.length)
            return 0;
        
        return count;
    }
}
