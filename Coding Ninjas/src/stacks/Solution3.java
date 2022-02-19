package stacks;

public class Solution3 {
	//	check redundant bracket

	public static boolean checkRedundantBrackets(String str) {
		if(str.length() <= 1)
            return false;
        
        int count = 0;
        boolean ans = true;
        Stack<Character> st = new Stack<>();
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != ')'){
                st.push(c);
            }
            while(c == ')' && st.peek() != '('){
                st.pop();
                count++;
            }
            if(st.peek() == '(' && c == ')'){
                if(count > 1){
                    count = 0;
                    ans = false;
                }else{
                    ans = true;
                    break;
                }
                st.pop();
            }
        }
        return ans;
	}
}
