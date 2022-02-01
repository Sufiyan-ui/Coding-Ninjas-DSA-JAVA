package recursion1;

public class Solution8 {
	//	All indices of a number

    static int[] ans = new int[1]; // resultant array
    
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        helper(input, x, 0, 0);
        return !isEmpty(ans) ? ans : (new int[0]);
	}
    
    // function to evaluate result using recursion
    public static void helper(int[] a, int x, int index, int i){
        if(a[index] == x){
            if(i == ans.length){
                reconstruct();
            }
            ans[i] = index;
            ++i;
        }
        if(index >= a.length-1){
            return;
        }
        helper(a, x, index + 1, i);
    }
    
    // function to check result array is empty or not
    public static boolean isEmpty(int[] a){
        return (a.length == 1 && a[0] <= 0) ? true : false;
    }
    
    // functiont to makes result array dynamic
    public static void reconstruct(){
        int[] temp = ans;
        ans = new int[ans.length+1];
        for(int i=0; i<temp.length; i++){
            ans[i] = temp[i];
        }
    }
}
