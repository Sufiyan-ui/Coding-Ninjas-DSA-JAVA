package recursion2;

public class Solution12 {
	//	Return all permutation - String

	public static String[] permutationOfString(String input){
		// Write your code here
		return permutationOfString(input, new String[] {}, 0, input.length() - 1);
	}
    
    public static String[] permutationOfString(String input, String[] output, int l, int r){
		if(l == r){
            String[] temp = output;
            output = new String[temp.length+1];
            for(int i=0; i<temp.length; i++){
                output[i] = temp[i];
            }
            output[temp.length] = input;
            return output;
        }
        
        
        for(int i=l; i<=r; i++){
            input = swapChar(input, l, i);
            output = permutationOfString(input, output,l+1, r);
            input = swapChar(input, l, i);
        }
        return output;
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
