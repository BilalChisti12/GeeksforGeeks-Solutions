/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int zeroC = 0;
        int oneC = 0;
        int twoC = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0) zeroC++;
            else if(temp.data == 1) oneC++;
            else twoC++;
            temp = temp.next;
        }
        temp = head;
        while(zeroC>0){
            temp.data=0;
            temp = temp.next;
            zeroC--;
        }
        // temp = temp.next;
        while(oneC>0){
            temp.data = 1;
            temp = temp.next;
            oneC--;
        }
        // temp = temp.next;
        while(twoC>0){
            temp.data = 2;
            temp = temp.next;
            twoC--;
        }
        return head;
    }
}