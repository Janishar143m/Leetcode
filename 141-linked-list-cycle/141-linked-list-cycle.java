/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int flag=0;
        int visited=Integer.MAX_VALUE;
        while(head!=null)
        {
           if(head.val!=visited)
           {
               head.val=visited;
               
           }
            else
            {
                flag=1;
                break;
            }
            head=head.next;
        }
        if(flag==1)
            return true;
        else
            return false;
        
    }
}