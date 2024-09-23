
// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int[] ans = new int[2];
        ans[0] = repeating(arr,n);
        ans[1] = missing(arr,n);
        return ans;
    }
    int repeating(int[] arr, int n){
        int r=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) r=arr[i];
            else continue;
        }
        return r;
    }
    int missing(int[] arr, int n){
        int c=1;
        for(int i=0; i<n; i++){
            if(c==arr[i]) c++;
            else if(c<arr[i]) break;
        }
        return c;
    }
}
