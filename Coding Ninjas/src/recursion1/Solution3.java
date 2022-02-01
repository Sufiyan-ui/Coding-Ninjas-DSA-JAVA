package recursion1;

public class Solution3 {
	//	Geometric Sum
	//	eg: 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
	public static double findGeometricSum(int k){
		// Write your code here
        double[] ans = new double[1];
        sum(k, ans);
        return ans[0];
	}
    public static void sum(int k, double[] ans){
        if(k < 0)
            return;
        ans[0] += (1 / power(2, k));
        sum(k-1, ans);
    }
    public static double power(int x,int p){
        if(p == 0){
            x=1;
        }
        for(int i=1; i<p; i++){
            x *= 2;
        }
        return (double) x;
    }
}
