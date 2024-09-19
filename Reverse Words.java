// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1


class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        Stack<String> st = new Stack();
        String[] words = str.split("\\.");
        for(String s : words){
            st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()) sb.append('.');
        }
        return sb.toString();
    }
}
