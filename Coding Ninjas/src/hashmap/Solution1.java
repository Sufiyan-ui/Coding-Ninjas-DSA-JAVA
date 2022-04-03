package hashmap;
import java.util.*;

public class Solution1 {
	// Maximum frequency number
	 public static int maxFrequencyNumber(int[] arr){ 
	        if(arr.length <= 0)
	            return -1;
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i=0; i<arr.length; i++){
	            if(!map.containsKey(arr[i])){
	                map.put(arr[i], 1);
	            }else{
	                int val = map.get(arr[i]);
	                map.put(arr[i], val+1);
	            }
	        }
	        
	        int ans = Integer.MIN_VALUE;
	        int max = 0;
	        Set<Integer> set = map.keySet();
	        for(int key: set){
	            if(map.get(key) > max){
	                ans = key;
	                max = map.get(key);
	            }
	        }
	        
	        if(max == 1){
	            return arr[0];
	        }
	        
	        return ans;
	    }
}
