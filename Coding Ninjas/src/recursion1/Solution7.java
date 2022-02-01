package recursion1;

public class Solution7 {
	//	Last Index of Number
	/*Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.*/
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int[] ans = new int[1];
        ans[0] = -1;
        helper(input, x, 0, ans);
        return ans[0];
	}
    public static void helper(int[] a, int x, int index, int[] ans){
        if(a[index] == x){
            ans[0] = index;
        }
        if(index >= a.length-1){
            return;
        }
        helper(a, x, index+1, ans);
    }
}
