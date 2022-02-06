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
        
        ListNode prev=new ListNode(-1);
        prev.next=head;
        ListNode temp=prev;
        while(head!=null)
        {
            while(head.next!=null && head.val==head.next.val)
                head=head.next;
            if(prev.next!=head)
                prev.next=head.next;
            else
                prev=prev.next;
            head=head.next;
            //prev=prev.next;
        }
        return temp.next;
        
    }
}