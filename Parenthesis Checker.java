
//  https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        int n = x.length();
        for(int i=0; i<n; i++){
            char ch = x.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                
                if(st.isEmpty()) return false;
                
                if((ch==')' && st.peek()=='(') || 
                   (ch==']' && st.peek()=='[') || 
                   (ch=='}' && st.peek()=='{')) {
                    st.pop();
                }
            
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}
