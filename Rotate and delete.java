
// https://www.geeksforgeeks.org/problems/rotate-and-delete-1587115621/1

class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int k=1;
        int n = arr.size();
        while(n>1){
            int last = arr.remove(arr.size()-1);
            arr.add(0, last);
            n = arr.size();
            int del = n-k;
            if(del<0) del=0;
            arr.remove(del);
            n--;
            k++;
        }
        return arr.get(0);
    }
}
