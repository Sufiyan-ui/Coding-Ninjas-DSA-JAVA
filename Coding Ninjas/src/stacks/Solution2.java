package stacks;

public class Solution2 {
	//	Balanced Parenthesis

    public static boolean isBalanced(String str) {
        if(str.length() <= 1) return false;
        
        int i = 0;
        Stack<Character> st = new Stack<>();
        
        while(i < str.length()){
            char c = str.charAt(i);
            if(c == '(' ||
               c == '{' ||
               c == '[' ){
               st.push(c);
            }else if(i > 0){
                if(st.peek() == '(' && c == ')' ||
                   st.peek() == '{' && c == '}' ||
                   st.peek() == '[' && c == ']' ){
                    st.pop();
                }else{
                    break;
                }
            }else{
                return false;
            }
            i++;
        }
        if(st.size() > 0) return false;
        return true;
    }
}
