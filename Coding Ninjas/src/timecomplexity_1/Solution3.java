package timecomplexity_1;
import java.util.Arrays;
public class Solution3 {
	//	pair sum in array

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        if(arr.length <= 1)
            return 0;
        
        Arrays.sort(arr);
        int count = 0;
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            if(arr[i] + arr[j] < num){
                i++;
            }else if(arr[i] + arr[j] > num){
                j--;
            }else{
                if(arr[i] == arr[j]){
                    int m = j - i+1;
                    count += (m*(m-1))/2;
                    break;
                }
                
                int start = i+1;
                int end = j-1;
                
                while(start <= end && arr[start] == arr[i])
                    start++;
                while(end >= end && arr[end] == arr[j])
                    end--;
                
                int f1 = start - i;
                int f2 = j - end;
                
                count += f1 * f2;
                i = start;
                j = end;
            }
        }
        return count;
	}
}
