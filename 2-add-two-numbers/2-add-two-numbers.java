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
        while(l1!=null && l2!=null)
        {
            int tot=(l1.val+l2.val+carry);
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
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
             int tot=(l1.val+carry);
            int sum=tot%10;
            ListNode temp=new ListNode(sum);
            carry=tot/10;
                result.next=temp;
                result=result.next;
           
            l1=l1.next;
        }
           while(l2!=null)
        {
             int tot=(l2.val+carry);
            int sum=tot%10;
            ListNode temp=new ListNode(sum);
            carry=tot/10;
           
                result.next=temp;
                result=result.next;
            
            l2=l2.next;
        }
        if(carry!=0)
            result.next=new ListNode(carry);
        return resultHead;
        
    }
}