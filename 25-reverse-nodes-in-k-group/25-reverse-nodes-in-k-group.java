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
    ListNode nextNode;
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null)
            return null;
        if(k==1)
            return head;
        ListNode tail=reverse(head,k);
        if(nextNode!=null)
         head.next=reverseKGroup(nextNode,k);
        return tail;
        
    }
    private boolean checkLength(ListNode node,int k)
    {
        int i=1;
        for(i=1;i<=k;i++)
        {
            if(node==null)
                break;
            node=node.next;
        }
        if(i<=k)
            return false;
        else
            return true;
        
    }
    private ListNode reverse(ListNode node,int k)
    {
       
        boolean result=checkLength(node,k);
       // System.out.println("result is:"+result);
         nextNode=null;
        if(result)
        {
            ListNode prev=null;
             ListNode next=null;
            for(int i=1;i<=k;i++)
        {
           if(node!=null)     
           {
               next=node.next;
            node.next=prev;
                prev=node;
                node=next;
           }
        }
            nextNode=next;
            //if(nextNode!=null)
              //System.out.println("Next node is:"+nextNode.val);
            return prev;
        }
        else
        {
           
            return node;
        }  
            
      
    }
}