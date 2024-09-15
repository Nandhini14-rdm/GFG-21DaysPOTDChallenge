
// https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev = null;
    Node head = null;
    
    Node bToDLL(Node root)
    {
	//  Your code here
	if(root==null) return null;
	bToDLL(root.left);
	if(prev==null) head=root;
	else{
	    prev.right = root;
	    root.left = prev;
	}
	prev = root;
	bToDLL(root.right);
	return head;
	
    }
}
