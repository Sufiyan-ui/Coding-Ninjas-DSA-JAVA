package timecomplexity_1;
import java.util.Arrays;
public class Solution4 {
	//	triplet sum

	public static int tripletSum(int[] arr, int num) {
        // Your code goes here
        int count = 0, n=arr.length-1;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int j=i+1;
            int k=n;
            
            while(j<k){
                if(arr[i]+arr[j]+arr[k] < num)
                    j++;
                else if(arr[i]+arr[j]+arr[k] > num)
                    k--;
                else{
                    
                    if(arr[j] == arr[k]){
                        int m = k-j+1;
                        count += ((m*(m-1))/2);
                        break;
                    }
                    
                    int start = j+1;
                    int end = k-1;
                    
                    while(start <= end && arr[start] == arr[j])
                        start++;
                    
                    while(end >= start && arr[end] == arr[k])
                        end--;
                    
                    int f1 = start-j;
                    int f2 = k - end;
                    count += f1*f2;
                    
                    j = start;
                    k = end;
                }
            }
        }
        return count;
    }
}
