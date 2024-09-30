
//   https://www.geeksforgeeks.org/problems/merge-two-bst-s/1

class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        helper(root1, list);
        helper(root2, list);
        list.sort(Integer::compareTo);
        return list;
    }
    
    private void helper(Node root, List<Integer> list){
        if(root==null) return;
        helper(root.left, list);
        list.add(root.data);
        helper(root.right, list);
    }
    
}
