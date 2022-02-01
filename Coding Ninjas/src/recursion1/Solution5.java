package recursion1;

public class Solution5 {
	//	Sum of Digits
	public static int sumOfDigits(int input){
		// Write your code here
        int ans[] = new int[1];
        sum(input, ans);
        return ans[0];
	}
    public static void sum(int n, int sum[]){
        if(n <= 0)
            return;
        sum[0] += n%10;
        sum(n/10, sum);
    }
}
