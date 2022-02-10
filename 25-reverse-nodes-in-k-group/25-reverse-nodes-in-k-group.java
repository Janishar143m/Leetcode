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
    public int findSize(ListNode head)
    {
        int size=0;
        while(head!=null)
        {
            size++;
            head=head.next;
        }
        return size;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        int size=findSize(head);
        if(head==null||head.next==null||k==1)
            return head;
        ListNode node=head;
        ListNode root=null;
        ListNode prev=null;
         ListNode start=null;
        if(size>=k)
        {
            prev=null;
            start=node;
            for(int i=0;i<k;i++)
            {
                ListNode temp=node.next;
                node.next=prev;
               prev=node;
                node=temp;
            }
            start.next=reverseKGroup(node,k);
        }
        
        if(size<k)
            return node;
        else
            return prev;
   
    }
}