package hashmap;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution5 {
	// longest Consecutive Increasing Sequence
public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] ar) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(ar == null || ar.length == 0){
            return ans;
        }
        
        Map<Integer, Boolean> h = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        
        for(int i=0; i<ar.length; i++)
            h.put(ar[i], true);
        
        
        for(int i=0; i<ar.length; i++){
            if(h.get(ar[i])){
                int length = 0;
                int temp = ar[i];
                int startTemp = ar[i];
                
                while(h.containsKey(temp)){
                    length++;
                    h.put(temp, false);
                    temp = temp+1;
                }
                
                temp = ar[i] - 1; // check cosecutve series before ar[i]
                
                while(h.containsKey(temp)){
                    length++;
                    startTemp = temp;
                    h.put(temp, false);
                    temp = temp - 1;
                }
                
                if(length > maxLength){
                    maxLength = length;
                    start = startTemp;
                }else if(maxLength == length){
                    maxLength = length;
                    for(int j=0; j<ar.length; j++){
                        if(ar[j] == start){
                            start = start;
                            break;
                        }else if(ar[j] == startTemp){
                            start = startTemp;
                            break;
                        }
                    }
                }
            }else{
                continue;
            }
        }
        
        if(maxLength == 1)
            ans.add(start);
        else if(maxLength > 1){
            ans.add(start);
            ans.add(start+maxLength - 1);
        }
        return ans;
    }
}
