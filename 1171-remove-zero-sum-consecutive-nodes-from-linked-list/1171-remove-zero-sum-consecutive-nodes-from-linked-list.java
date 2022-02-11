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
    
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode node=dummy;
        int sum=0;
        while(node!=null)
        {
            int val=node.val;
            sum+=val;
            if(map.containsKey(sum))
            {
                ListNode prevNode=map.get(sum);
                ListNode current=prevNode.next;
                int tempSum=sum+current.val;
                while(tempSum!=sum)
                {
                    
                   
                    map.remove(tempSum);
                    current=current.next;
                     tempSum+=current.val;
                    
                    
                } 
                map.get(sum).next=current.next;
            }
            else
                map.put(sum,node);
            node=node.next;
        }
        return dummy.next;
        
        
    }
}