package recursion2;

public class Solution2 {
	//	Print Subsequences
	public static void printSubsequences(String s) {
		printSubsequences(s, "");
	}
	public static void printSubsequences(String s, String output) {
		if(s.length() == 0) {
			System.out.println(output);
			return;
		}
		
		printSubsequences(s.substring(1), output);
		printSubsequences(s.substring(1), s.charAt(0)+output);
	}
}
