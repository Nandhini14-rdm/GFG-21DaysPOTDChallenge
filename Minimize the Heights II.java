// https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n==1) return 0;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]<k) continue;
            int small = Math.min(arr[0]+k, arr[i]-k);
            int large = Math.max(arr[n-1]-k, arr[i-1]+k);
            ans = Math.min(ans, large-small);
        }
        return ans;
    }
}
