package stacks;

public class Solution4 {
	//	stock span

	public static int[] stockSpan(int[] price) {
		if(price.length <= 1)
            return new int[] {1};
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] span = new int[price.length];
        span[0] = 1;
        for(int i=1 ; i < price.length; i++){
            while(!st.isEmpty() && price[st.peek()] < price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
	}
}
