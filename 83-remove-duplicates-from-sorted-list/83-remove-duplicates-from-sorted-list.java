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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode start=null;
        ListNode result=head;
        while(head!=null)
        {
            start=head;
            int prev=start.val;
            while(head!=null && head.val==prev)
                head=head.next;
            start.next=head;
            //head=head.next;
            
        }
        return result;
        
        
    }
}