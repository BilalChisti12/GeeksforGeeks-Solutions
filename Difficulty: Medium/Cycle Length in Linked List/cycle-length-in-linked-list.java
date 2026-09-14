/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        if(head == null || head.next == null) return 0;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return 0;
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        Node temp = fast;
        slow=slow.next;
        int len=1;
        while(slow!=temp){
            slow=slow.next;
            len++;
        }
        return len;
    }
}