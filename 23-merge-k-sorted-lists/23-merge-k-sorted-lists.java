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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode result=new ListNode(-10001);
        ListNode resultHead=result;
        if(lists.length==0)
            return null;
        Queue<ListNode> queue=new PriorityQueue<>((a,b)->a.val-b.val);        
        for(ListNode node:lists)
        {
            if(node!=null)
             queue.offer(node);
        }
        while(!queue.isEmpty())
        {
           
            ListNode node=queue.poll();
            result.next=node;
            result=result.next;
            if(node.next!=null)
              queue.offer(node.next);
            
        } 
        return resultHead.next;
            
        
        
        
    }
}