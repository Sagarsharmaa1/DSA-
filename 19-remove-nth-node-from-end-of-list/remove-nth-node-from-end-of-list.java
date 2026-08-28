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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode curr = head;
        while( n > 0 ){
            curr = curr.next;
            n--;
        }
        if(curr == null) return head.next;

        ListNode temp = head;
        ListNode prev = temp;

        while(curr != null){
            prev = temp;
            temp = temp.next;
            curr = curr.next;

        }

        prev.next = temp.next;

        return head;
    }
}