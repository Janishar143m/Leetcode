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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result=null;
        ListNode resultHead=null;
        int carry=0;
        while(l1!=null || l2!=null||carry!=0)
        {
            
            int tot=0;
            if(l1!=null)
                tot+=l1.val;
            if(l2!=null)
                tot+=l2.val;
            if(carry!=0)
                tot+=carry;
            int sum=tot%10;
            ListNode temp=new ListNode(sum);
            carry=tot/10;
            if(resultHead==null)
            {
                resultHead=temp;
                result=temp;
            }
            else
            {
                result.next=temp;
                result=result.next;
            }
            if(l1!=null)
              l1=l1.next;
            if(l2!=null)
             l2=l2.next;
        }
        return resultHead;
        
    }
}