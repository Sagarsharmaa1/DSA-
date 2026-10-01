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
    public ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode next = head.next;

        temp.next = null;

        ListNode reverseN = reverse(next);

        next.next = temp;

        return reverseN;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        return reverse(head);
    }
}