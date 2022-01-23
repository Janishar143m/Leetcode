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
    
    public int size(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int len1=size(l1);
        int len2=size(l2);
        ListNode temp=null,resHead=null;
        while(l1!=null||l2!=null)
        {
            int v1=0,v2=0;
            if(len1>=len2)
            {
                v1=l1.val;
                l1=l1.next;
                 len1--;   
            }
            if(len2>=len1+1)
            {
                v2=l2.val;
                l2=l2.next;
                len2--;
            }
            temp=new ListNode(v1+v2);
            temp.next=resHead;
            resHead=temp;
            
        }
       // return temp;
        int carry=0;
        resHead=null;
        while(temp!=null)
        {
            int tempVal=temp.val+carry;
            if(tempVal>9)
            {
                temp.val=tempVal%10;
                carry=tempVal/10;
            }
            else
            {
                temp.val=tempVal;
                carry=0;
            }
                
            ListNode prev=temp.next;
            temp.next=resHead;
            resHead=temp;
            temp=prev;
        }
        if(carry>0)
        {
            temp=new ListNode(carry);
            temp.next=resHead;
            resHead=temp;
            //temp.next=null;
        }
        return resHead;
        
    }
}