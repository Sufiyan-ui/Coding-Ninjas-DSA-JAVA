package hashmap;

public class Solution7 {
	// longest subset zero sum

	public static int lengthOfLongestSubsetWithZeroSum(int ar[]) {
		if(ar == null || ar.length == 0)
            return 0;
        
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        int max_len_2 = 0;
        for(int i=0; i<ar.length; i++){
            sum += ar[i];
            if(h.containsKey(sum)){
                int k = h.get(sum);
                int l = i-k;
                max_len = l;
            }else
                h.put(sum, i);
            if(sum == 0){
                max_len = i+1;
            }
            if(max_len > max_len_2)
                max_len_2 = max_len; 
        }
        return max_len_2;
        
	}
}
