package recursion1;

public class Solution2 {
	//	count zeros
	public static int countZerosRec(int input){
		// Write your code here
        int[] ans = new int[1];
        if(input == 0)
            ans[0] = 1;
        else
        	count(input, ans);
        return ans[0];
	}
    public static void count(int n, int[] ans){
        
        if(n <= 0){
            return;
        }
        int temp = n%10;
        if(temp == 0){
            ans[0] += 1;
        }
        count(n/10, ans);
    }
}
