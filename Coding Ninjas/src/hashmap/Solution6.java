package hashmap;

public class Solution6 {
	// Pair with difference K
	public static int getPairsWithDifferenceK(int ar[], int k) {
		if(ar.length == 0)
            return 0;
        
        HashMap<Integer, Integer> h = new HashMap<>();
        int count = 0;
        for(int it: ar){
            if(h.containsKey(it)){
                int val = h.get(it);
                h.put(it, val+1);
            }else
                h.put(it, 1);
        }
        
        for(int it: ar){
            if(k == 0){
		    int m = h.get(it);
            count += m*(m-1)/2;
            h.put(it, 0);
		 	continue;
        }
            
		if(h.get(it) != 0){
            if(h.containsKey(it-k)){
                int m1 = h.get(it);
                int m2 = h.get(it-k);
                count += m1*m2;
                }

            if(h.containsKey(it+k)){
                int m1 = h.get(it);
                int m2 = h.get(it+k);
                count += m1*m2;
                }
                h.put(it, 0);
            }
        }
        return count;
	}
}
