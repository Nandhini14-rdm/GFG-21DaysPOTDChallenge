
//  https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1

class Solution {
    int lps(String s) {
        // code here
        int n = s.length();
        int[] lps = new int[n];
        int i=1, len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n-1];
    }
}
