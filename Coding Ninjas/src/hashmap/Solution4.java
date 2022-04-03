package hashmap;
import java.util.LinkedHashSet;

public class Solution4 {

	// Extract unique characters
	
	public static String uniqueChar(String str){
		if(str.length() == 0)
            return "";
        
        int n = str.length();
        String s = "";
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(!set.contains(c)){
                s+=c;
            }
            set.add(c);
        }
        
        return s;
	}
}
