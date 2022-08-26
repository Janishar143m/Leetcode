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
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode slowPrev=head;
        while(n>0)
        {
            fast=fast.next;
            n--;
        }
        if(slow==head && fast==null)
            return slow.next;
        
        while(slow!=null && fast!=null)
        {
            slowPrev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        slowPrev.next=slow.next;
        slow.next=null;
        return head;
        
        
    }
}