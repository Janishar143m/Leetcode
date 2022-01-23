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
    
    public ListNode reverseList(ListNode head)
    {
        ListNode temp=null,next=null;
        
            while(head!=null)
            {
                next=head.next;
                head.next=temp;
                temp=head;
                head=next;
            }
        return temp;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1=reverseList(l1);
        l2=reverseList(l2);
        ListNode result=null,head=null;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            
            if(result==null)
            {
                result=new ListNode();
                head=result;
                
            }
            else
            {
                result.next=new ListNode();
                result=result.next;
            }   
            int sum=(l1.val+l2.val+carry);
           result.val=sum%10;
           carry=sum/10;  
            l1=l1.next;
            l2=l2.next;           
        }
        while(l1!=null)
        {
            result.next=new ListNode();
            result=result.next;
            int sum=(l1.val+carry);
            result.val=sum%10;
            carry=sum/10;
            l1=l1.next;
        }
         while(l2!=null)
        {
            result.next=new ListNode();
            result=result.next;
             int sum=(l2.val+carry);
            carry=sum/10;
            result.val=sum%10;
            l2=l2.next;
        }
        if(carry!=0)
        {
            result.next=new ListNode();
            result=result.next;
            result.val=carry;
        }
        return reverseList(head);
        
    }
}
