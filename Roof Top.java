
// https://www.geeksforgeeks.org/problems/roof-top-1587115621/1


class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int c=0, n=arr.length, m=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                c++;
                m = Math.max(c,m);
            }else{
                c=0;
            }
            
        }
        return m;
    }
}
