
// https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        if(s.length()<p.length()) return "-1";
        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];
        for(char c : p.toCharArray()){
            targetFreq[c-'a']++;
        }
        int start=0, ml=Integer.MAX_VALUE, cnt=0, ws=-1, uc=0;
        for(int f:targetFreq){
            if(f>0) uc++;
        }
        for(int end=0; end<s.length(); end++){
            char ch = s.charAt(end);
            windowFreq[ch-'a']++;
            if(targetFreq[ch-'a']>0  &&  windowFreq[ch-'a']==targetFreq[ch-'a']){
                cnt++;
            }
            while(cnt==uc){
                if(end-start+1 < ml){
                    ml = end-start+1;
                    ws = start;
                }
                char sc = s.charAt(start);
                windowFreq[sc-'a']--;
                if(targetFreq[sc-'a']>0 && windowFreq[sc-'a']<targetFreq[sc-'a']){
                    cnt--;
                }
                start++;
            }
        }
        return ws==-1?"-1":s.substring(ws, ws+ml);
    }
}
