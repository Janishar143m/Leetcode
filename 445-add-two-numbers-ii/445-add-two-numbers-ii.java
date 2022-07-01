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
        
        //Stack<Integer> s1=new Stack<>();
        //Stack<Integer> s2=new Stack<>();
        l1=reverseList(l1);
        l2=reverseList(l2);
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        int carry=0;
        while(l1!=null||l2!=null)
        {
            ListNode sum=new ListNode();
            prev.next=sum;
            sum.val+=carry;
            //System.out.println("Popped element1:"+s1.peek());
            //System.out.println("Popped element2:"+s2.peek());
            if(l1!=null)
            {
                sum.val+=l1.val;
                l1=l1.next;
            }  
            if(l2!=null)
            {
                sum.val+=l2.val;
                l2=l2.next;
            }   
             //System.out.println("Digit sum:"+sum.val);
            carry=sum.val/10;
            sum.val=sum.val%10;
            //System.out.println("Carry:"+carry);
            //System.out.println("Sum:"+sum.val);
            prev=sum;
        }
        if(carry!=0)
        {
            ListNode sum=new ListNode(carry);
            prev.next=sum;
        }   
        
       ListNode res=reverseList(temp.next);
       // System.out.println(temp.next.val);
        return res;
        
    }
    private ListNode reverseList(ListNode start)
    {
        ListNode prevNode=null;
         ListNode temp=null;
        ListNode node=start;
         //System.out.println(node.val);
        while(node!=null)
        {
            temp=node.next;
            node.next=prevNode;
            prevNode=node;
            node=temp;
            //System.out.println(node.val);
            
        }
        return prevNode;
    }
}