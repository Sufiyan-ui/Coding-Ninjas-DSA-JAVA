package hashmap;
import java.util.*;

public class Solution3 {
	// Print Sum to zero
	public static int PairSum(int[] ar, int size) {
        if(ar.length == 0)
            return 0;
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int it: ar){
            if(map.containsKey(it)){
                int val = map.get(it);
                map.put(it, val+1);
            }else{
                map.put(it, 1);
            }
        }
        
        for(int it: ar){
            if(map.containsKey(-it) && map.get(it) != 0){
                if(it == -it){
                    int m = map.get(it);
                    count += (m*(m-1))/2;
                    map.put(it, 0);
                    continue;
                }
                int m1 = map.get(it);
                int m2 = map.get(-it);
                count += (m1*m2);
                map.put(it, 0);
                map.put(-it, 0);
            }
        }
        
        return count;
	}
}
