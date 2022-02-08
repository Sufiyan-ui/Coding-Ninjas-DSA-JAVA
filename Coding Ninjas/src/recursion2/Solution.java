package recursion2;

public class Solution {
	//	Return Subsequences
	public static String[] subsequences(String s) {
		if(s.length() <= 0)
			return new String[] {""};
		
		String[] smallAns = subsequences(s.substring(1));
		String[] ans = new String[smallAns.length*2];
		
		int k=0;
		for(int i=0; i<smallAns.length; i++) {
			ans[i] = smallAns[i];
			k++;
		}
		
		for(int i=0; i<smallAns.length; i++) {
			ans[i+k] = s.charAt(0)+smallAns[i];
		}
		return ans;
	}
}
