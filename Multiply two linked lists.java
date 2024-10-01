//  https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;
        long m = 0;
        while(first!=null){
            m = (m*10 + first.data) % mod;
            first = first.next;
        }
        long n = 0;
        while(second!=null){
            n = (n*10 + second.data) % mod;
            second = second.next;
        }
        return ((m*n)%mod);
    }
}
