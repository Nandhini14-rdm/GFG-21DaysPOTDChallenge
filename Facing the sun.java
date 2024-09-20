
// https://www.geeksforgeeks.org/problems/facing-the-sun2126/1

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int max=height[0];
        int c=1;
        for(int i : height){
            if(i>max){
                max=i;
                c++;
            }
        }
        return c;
    }
}
