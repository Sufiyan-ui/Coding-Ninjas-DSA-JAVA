package recursion1;

public class Solution1 {
	//	Multiplication (Recursive)
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(m == 0 || n == 0)
            return 0;
        
        return m + multiplyTwoIntegers(m, n-1);
	}
}
