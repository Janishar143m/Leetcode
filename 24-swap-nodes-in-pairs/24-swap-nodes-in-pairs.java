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
    public ListNode swapPairs(ListNode head) {
       
        ListNode prev=null;
        if(head==null)
            return null;
         ListNode node=head;
        while(node!=null && node.next!=null)
        {
            if(prev==null)
            {
                head=node.next;
                prev=node.next;
            }
            else
             prev.next=node.next;
            ListNode temp=node.next.next;
            node.next.next=node;
            node.next=temp;
            prev=node;
            node=temp;   
        }
        return head;
        
    }
}