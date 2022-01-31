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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null|| head.next==null)
            return null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                break;
        }
        slow=head;
        while(slow!=null && fast!=null && slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        if(slow!=null && fast!=null)
            return slow;
        else
            return null;
        
    }
}