package stacks;

public class Solution5 {
	//	minimum bracket reversal

	public static int countBracketReversals(String str) {
		if(str.length() <= 0) return -1;
        
        if(str.length()%2 == 1)
            return -1;
        
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!st.isEmpty() && st.peek() == '{' && c == '}'){
                st.pop();
            }
            else
            	st.push(c);
        }
        while(!st.isEmpty()){
            char c1 = st.pop();
            char c2 = st.pop();
            if(c1 == c2){
                ans++;
            }else if(c1 != c2){
                ans += 2;
            }
        }
        return ans;
	}

}
