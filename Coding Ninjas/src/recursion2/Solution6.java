package recursion2;

public class Solution6 {
	// Return Subsets
	public static int[][] subsets(int[] input){
		return subsets(input, 0);
	}
	
	public static int[][] subsets(int[] input, int si){
		if(si>=input.length) {
			return new int[1][0];
		}
		
		int[][] smallAns = subsets(input, si+1);
		int[][] ans = new int[smallAns.length*2][];
		
		int k=0;
		for(int i=0; i<smallAns.length; i++) {
			ans[i] = new int[smallAns[i].length];
			for(int j=0; j<smallAns[i].length; j++) {
				ans[i][j] = smallAns[i][j];
			}
			k++;
		}
		
		for(int i=0; i<smallAns.length; i++) {
			ans[i+k] = new int[smallAns[i].length+1];
			ans[i+k][0] = input[si];
			for(int j=1; j<=smallAns[i].length; j++) {
				ans[i+k][j] = smallAns[i][j-1];
			}
		}
		return ans;
	}
	
}
