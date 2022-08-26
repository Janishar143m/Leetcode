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
      
        private ListNode middle(ListNode node)
        {
            ListNode slow=node;
            ListNode fast=node;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
            
        }
        private ListNode reverseList(ListNode node)
        {
            ListNode prev=null;
            while(node!=null)
            {
                ListNode next=node.next;
                node.next=prev;
                prev=node;
                node=next;
            }
            return prev;
        }
    public void reorderList(ListNode head) 
    {
          if(head==null || head.next==null)
              return;
          ListNode head1=head;
          ListNode midNode=middle(head);
          ListNode head2=midNode.next;
           midNode.next=null;
          head2=reverseList(head2);
          while(head1!=null && head2!=null)
          {
              ListNode temp=head1.next;
              head1.next=head2;
              head1=head2;
              head2=temp;
          }
          
         
    }
}