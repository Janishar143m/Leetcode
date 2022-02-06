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
        ListNode node=head;
        ListNode result=null;
        ListNode resultHead=null;
        if(head==null||head.next==null)
            return head;
        while(node!=null)
        {
            int ct=1;
            while(node.next!=null && node.val==node.next.val)
            {
                ct++;
                node=node.next;
            }
            if(ct==1)
            {
                if(result==null)
                {
                    result=node;
                    resultHead=result;
                }  
                else
                {
                    result.next=node;
                    result=result.next;
                    //result.next=null;
                }   
                
            }
            node=node.next;
        }
        if(result!=null)
         result.next=null;
        return resultHead;
        
    }
}