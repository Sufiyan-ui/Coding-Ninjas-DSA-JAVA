package recursion2;

public class Solution8 {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return sum(input, k);
	}
    
    public static int[][] sum(int[] input, int k){
        return subsetsSumK(input, k, 0);
    }
    public static int[][] subsetsSumK(int[] input, int k, int si) {
        if(si>=input.length)
        {
            if(k == 0)
            	return new int[1][0];
            else
                return new int[0][0];
        }
        
        int[][] sa = subsetsSumK(input, k-input[si], si+1);
        int[][] sa_2 = subsetsSumK(input, k, si+1);
        
        int ans[][] = new int[sa.length+sa_2.length][];
        
        int l = 0;
        for(int i=0; i<sa_2.length; i++){
            ans[i] = new int[sa_2[i].length];
            for(int j=0; j<sa_2[i].length; j++){
                ans[i][j] = sa_2[i][j];
            }
            l++;
        }
        
        for(int i=0; i<sa.length; i++){
            ans[i+l] = new int[sa[i].length+1];
            ans[i+l][0] = input[si];
            for(int j=1; j<=sa[i].length; j++){
                ans[i+l][j] = sa[i][j-1];
            }
        }
        return ans;
	}
}
