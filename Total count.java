

//  https://www.geeksforgeeks.org/problems/total-count2415/1


class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int c=0;
        for(int i=0; i<arr.length; i++){
            while(arr[i]>0){
                arr[i]-=k;
                c++;
            }
        }
        return c;
    }
}
