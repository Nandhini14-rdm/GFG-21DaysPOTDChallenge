
// https://www.geeksforgeeks.org/problems/longest-valid-parentheses5657/1

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int len=0;
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch=='(') st.push(i);
            else{
                st.pop();
                if(!st.isEmpty()) len=Math.max(len, i-st.peek());
                else st.push(i);
            }
        }
        return len;
    }
}
