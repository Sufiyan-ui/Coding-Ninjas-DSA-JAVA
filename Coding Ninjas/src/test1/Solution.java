package test1;

public class Solution {
	//	does s contains t ?
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(b.length() <= 0)
        	return true;
            
        if(a.length() == 0)
            return false;
        
        
        if(b.charAt(0) == a.charAt(0)){
            return checkSequence(a.substring(1), b.substring(1));
        }
        
        return checkSequence(a.substring(1),b);
	}
}
