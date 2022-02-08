package timecomplexity_1;

public class Solution5 {
	//	rotate an array

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        if(arr.length <= 1)
            return;
        
        int n = arr.length;
        d %= n;
        int[] a = new int[d];
        for(int i=0; i<d; i++){
            a[i] = arr[i];
        }
        int k=0;
        for(int i=0; i<n-d; i++){
            arr[i]=arr[d+i];
            k++;
        }
        int j=0;
        for(int i=k; i<n; i++){
            arr[i] = a[j];
            j++;
        }
    }
}
