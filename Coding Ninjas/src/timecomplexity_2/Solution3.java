package timecomplexity_2;
import java.util.Arrays;
public class Solution3 {
	//	array intersection

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i1 = 0;
        int i2 = 0;
        
        while(i1 < arr1.length && i2 < arr2.length){
            if(arr1[i1] < arr2[i2])
                i1++;
            else if(arr2[i2] < arr1[i1])
                i2++;
            else{
                System.out.print(arr1[i1]+" ");
                i1++;
                i2++;
            }
        }
	}
}
