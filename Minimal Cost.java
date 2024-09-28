
//https://www.geeksforgeeks.org/problems/minimal-cost/1

class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        dp[0]=0;
        for(int i=1; i<n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=Math.max(0,i-k); j<i; j++){
                dp[i] = Math.min(dp[i], dp[j]+Math.abs(arr[i]-arr[j]));
            }
        }
        return dp[n-1];
    }
}
