/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next ==null || k==0) return head;
        
        ListNode temp = head;
        int n =0;
        while(temp != null){
            n += 1;
            temp = temp.next;
        }
        if(k % n == 0) return head;
        int idx = k % n;
        int i =0;

        ListNode curr = head;
        while( curr != null && i < n -idx-1){
            curr = curr.next;
            i++;
        }

        ListNode newhead = curr.next;
        curr.next = null;

        ListNode c = newhead;
        while(c.next != null){
            c = c.next;
        }

        c.next = head;
        
       

        return newhead;

    }
}