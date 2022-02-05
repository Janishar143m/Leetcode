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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
            return head;
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        int ct=0;
        while(temp!=null)
        {
            
            ct++;
            temp=temp.next;
        }
        k=k%ct;
        if(k==0)
            return head;
        for(int i=0;i<k;i++)
            fast=fast.next;
        
        while(fast.next!=null && fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        temp=slow.next;
        slow.next=null;
        fast.next=head;
        return temp;
        
        
        
        
        
    }
}