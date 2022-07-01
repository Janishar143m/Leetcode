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
        
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null)
        {
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            s2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            ListNode sum=new ListNode();
            prev.next=sum;
            sum.val+=carry;
            //System.out.println("Popped element1:"+s1.peek());
            //System.out.println("Popped element2:"+s2.peek());
            if(!s1.isEmpty())
                sum.val+=s1.pop();
            if(!s2.isEmpty())
                sum.val+=s2.pop();
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