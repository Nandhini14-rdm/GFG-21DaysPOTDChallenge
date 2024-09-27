

// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0; i<=n-k; i++){
            if(idx<i){
                max = arr[i];
                idx=i;
                for(int j=i+1; j<i+k; j++){
                    if(arr[j]>max){
                        max = arr[j];
                        idx = j;
                    }
                }
            }else{
                if(arr[i+k-1]>max){
                    max = arr[i+k-1];
                    idx = i+k-1;
                }
            }
            list.add(max);
        }
        return list;
    }
}


