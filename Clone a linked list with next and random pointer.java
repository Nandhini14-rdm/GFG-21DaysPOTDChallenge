
// https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1

class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        Node curr = head;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next =temp;
            curr = temp;
        }
        curr = head;
        while(curr!=null){
            if(curr.next!=null){
                curr.next.random = curr.random==null?null:curr.random.next;
                curr = curr.next.next;
            }
        }
        Node x = head;
        Node y = head.next;
        Node temp = y;
        while(x!=null){
            x.next = x.next.next;
            y.next= y.next==null?null:y.next.next;
            x = x.next;
            y = y.next;
        }
        return temp;
    }
}
