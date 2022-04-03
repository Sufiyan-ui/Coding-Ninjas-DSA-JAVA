package hashmap;
import java.util.Arrays;

public class Solution2 {

	// Print Intersection
	
	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        if(arr1.length == 0 || arr2.length == 0)
            return;
        
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        while(i < n1 && j < n2){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
	}
}
