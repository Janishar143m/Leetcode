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
        
        ListNode fast=head;
        ListNode slow=head;
        ListNode slowPrev=head;
        
        for(int i=1;i<=n;i++)
            fast=fast.next;
        
        if(slow==head && fast==null)
            return head.next;
        while(fast!=null && slow!=null)
        {
            slowPrev=slow;
            fast=fast.next;
            slow=slow.next;
        }
      slowPrev.next=slow.next;
           slow.next=null;
        return head;
        
    }
}