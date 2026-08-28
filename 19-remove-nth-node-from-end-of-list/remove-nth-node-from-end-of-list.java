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
        ListNode temp = head;
        int idx = 0;
        while(temp != null){
            idx++;
            temp = temp.next;
        }
        if(idx == n) return head.next;
        temp = head;
        ListNode prev=temp;

        int i =0;

        while(i < idx - n ){
            prev = temp;
            temp = temp.next;
            i++;
            
        } 
        prev.next = temp.next;

        return head;
    }
}