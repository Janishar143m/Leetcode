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
        if(lists.length==0)
            return null;
        ListNode dummy=new ListNode(-20000);
        ListNode tail=dummy;
        Queue<ListNode> pq=new PriorityQueue<>(lists.length,(p,q)->(p.val-q.val));
        for(ListNode node:lists)
        {
            if(node!=null)
              pq.offer(node);
        }
        while(pq.size()>0)
        {
            tail.next=pq.poll();
            tail=tail.next;
            if(tail.next!=null)
                pq.add(tail.next);
        }
        return dummy.next;
        
        
    }
}