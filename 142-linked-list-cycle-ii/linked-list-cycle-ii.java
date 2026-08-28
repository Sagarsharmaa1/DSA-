/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean detect(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast!= null && fast.next!=null && slow != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public ListNode detectCycle(ListNode head) {
        
        if(!detect(head)) return null ;
       
       ListNode slow = head;
       ListNode fast = head;

       while(fast!=null && fast.next!= null && slow != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            break;
        }

       }

       slow = head;
       while(slow != fast){
        slow = slow.next;
        fast = fast.next;

       }
       return slow;  
    }
}