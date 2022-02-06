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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
            return head;
        ListNode list1=head;
        ListNode list2=head.next;
        ListNode list1Head=list1;
        ListNode list2Head=list2;
        while(list1.next!=null && list1.next.next!=null)
        {
            list1.next=list1.next.next;
            list1=list1.next;
           list2.next=list1.next;
             list2=list2.next;
              
        }
         list1.next=list2Head;
        return list1Head;
        
        
    }
}