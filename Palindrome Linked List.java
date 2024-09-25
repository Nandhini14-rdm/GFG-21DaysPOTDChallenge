
// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        if(head==null || head.next==null) return true;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        while(slow!=null){
            Node temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(right.data!=left.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
