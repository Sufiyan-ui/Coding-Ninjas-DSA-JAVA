package recursion1;

public class Solution4 {
	//	Check Palindrome (recursive)
	public static boolean isStringPalindrome(String input) {
		// Write your code here
        if(input.length() == 1)
            return true;
        return palindrome(input, 0, input.length() - 1);
	}
    public static boolean palindrome(String s, int start, int end){
        if(start >= end)
            return true;
        if(s.charAt(start) == s.charAt(end))
        	return	palindrome(s, start+1, end-1);
        
        return false;
    }
}
