package test1;
import java.util.Arrays;

public class Solution2 {
	//	Maximum profit on app
    static int max = Integer.MIN_VALUE;
	public static int maximumProfit(int budget[]) {
		// Write your code here
        Arrays.sort(budget);
        return maximumProfit(budget, 0);
	}
    private static int maximumProfit(int[] budget, int si){
        if(si >= budget.length)
            return max;
        
        max = Math.max(max, budget[si]*(budget.length-si));
    return maximumProfit(budget, si+1);
    }
}
