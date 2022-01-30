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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode node1=list1;
        ListNode node2=list2;
        ListNode result=null;
        ListNode resultStart=result;
        while(node1!=null && node2!=null)
        {
            if(node1.val<node2.val)
            {
             if(result==null)
             {
                 result=node1;
                 resultStart=result;
             }   
                else
                {
                    result.next=node1;
                    result=result.next;
                }   
              node1=node1.next;                              
            }
            else
            {
                if(result==null)
                {
                  result=node2;
                  resultStart=result;
                } 
                else
                {
                    result.next=node2;
                    result=result.next;
                }   
              node2=node2.next;                              
            }
            
        }
        while(node1!=null)
        {
            if(result==null)
             {
                 result=node1;
                 resultStart=result;
             }   
                else
                {
                    result.next=node1;
                    result=result.next;
                }   
              node1=node1.next;   
        }
        while(node2!=null)
        {
            if(result==null)
             {
                 result=node2;
                 resultStart=result;
             }   
                else
                {
                    result.next=node2;
                    result=result.next;
                }   
              node2=node2.next;   
        }
        return resultStart;
        
    }
}