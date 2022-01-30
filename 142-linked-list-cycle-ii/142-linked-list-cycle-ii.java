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
        
        int visitValue=Integer.MAX_VALUE;
        if(head==null)
            return null;
        while(head.next!=null && head.next.val!=visitValue)
        {
            head.val=visitValue;
            head=head.next;
        }
        return head.next;
        
    }
}