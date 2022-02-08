package recursion2;

public class Solution4 {
	//	Staircase
	public static int staircase(int n){
		
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
	        if(n<0){
	            return 0;
	        }
	         
	        if(n == 0){
	            return 1;
	        }
	         
	         int x = staircase(n-1);
	         int y = staircase(n-2);
	         int z = staircase(n-3);
	         
	         return x+y+z;
		}
}
