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
    public int getDecimalValue(ListNode head) {
        
        int i=0,sum=0;
         ListNode temp=null,next=null;
        
            while(head!=null)
            {
                next=head.next;
                head.next=temp;
                temp=head;
                head=next;
            }
        while(temp!=null)
        {
           sum+=temp.val*Math.pow(2,i++);
           temp=temp.next; 
        }
        return sum;
        
    }
}