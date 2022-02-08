package recursion2;

public class Solution10 {
	//	return all codes - String
	public static char helper(int n){
        int num = 'a' + n - 1;
        char c = (char) num ;
        return c;
    }

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
        if(input.length() <= 0){
            return new String[] {""};
        }
        String[] sa = getCode(input.substring(1));
        
        int num = input.charAt(0)-'0';
        char firstchar = helper(num);
        for(int i=0; i<sa.length; i++){
            sa[i] = firstchar+sa[i];
        }
        
        String[] sa_2 = new String[0];
        if(input.length() >= 2){
            int num2 = (input.charAt(0)-'0')*10 + input.charAt(1)-'0';
        	if(num2 >= 10 && num2 <= 26){
            char firsttwochar = helper(num2);
                sa_2 = getCode(input.substring(2));
                for(int i=0; i<sa_2.length; i++){
                    sa_2[i] = firsttwochar+sa_2[i];
                }
            }
        }
        
        String[] finalAns = new String[sa.length+sa_2.length];
        int k = 0;
        
        for(int i=0; i<sa.length; i++){
            finalAns[i] = sa[i];
            k++;
        }
        
        for(int i=0; i<sa_2.length; i++){
            finalAns[k+i] = sa_2[i];
        }
        
        return finalAns;
        
	}
}
