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
             ListNode temp=null;
        ListNode resHead=null;
        ListNode result=null;
        while(head!=null)
        {
            temp=head;
            while(head.next!=null && head.val==head.next.val)
                head=head.next;
            if(temp==head)
            {
                if(result==null)
                {
                    result=new ListNode(temp.val);
                    resHead=result;
                }
                else
                {
                    result.next=new ListNode(temp.val);
                    result=result.next;
                }
            }
            head=head.next;

        }
        return resHead;
        
    }
}