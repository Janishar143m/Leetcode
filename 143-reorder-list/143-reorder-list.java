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
  
    public ListNode middle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode temp=null;
        ListNode node=head;
        while(node!=null)
        {
            ListNode val=node.next;
            node.next=temp;
            temp=node;
            node=val;
        }
        return temp;
    }
      public void reorderList(ListNode head) 
      {
          
          ListNode mid=middle(head);
          ListNode head1=head;
          ListNode head2=mid.next;
          mid.next=null;
          head2=reverse(head2);
          while(head1!=null && head2!=null)
          {
              ListNode temp=head1.next;
              head1.next=head2;
              head1=head2;
              head2=temp;
              
          }
          //return head;
        
        
        
        
    }
}