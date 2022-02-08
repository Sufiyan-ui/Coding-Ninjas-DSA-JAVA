package recursion2;

public class Solution5 {
	//	Binary Search
	public static int binarySearch(int input[], int element) {
		return binarySearch(input, element, 0, input.length-1);
	}
    
    public static int binarySearch(int a[], int key, int s, int e) {
        if(s <= e){
            int m = (s + e)/2;
            if(a[m] == key){
                return m;
            }
            if(key < a[m]){
                return binarySearch(a, key, s, m-1);
            }else{
                return binarySearch(a, key, m+1, e);
            }
        }
        return -1;
    }
}
