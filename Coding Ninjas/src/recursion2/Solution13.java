package recursion2;

public class Solution13 {
	// Print all Permutation

	public static void FindPermutations(String str) {
		permutation(str, 0, str.length()-1);
	}
    
    public static void permutation(String str, int l, int r) { 
        if(l == r){
            System.out.println(str);
            return;
        }
        
        for(int i=l; i<=r; i++){
            str = swapChar(str, l, i);
            permutation(str, l+1, r);
            str = swapChar(str, l, i);
        }
    }
    
    public static String swapChar(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
            String s = "";
            for(char c: ch){
                s+=c;
            }
        return s;
    }
}
