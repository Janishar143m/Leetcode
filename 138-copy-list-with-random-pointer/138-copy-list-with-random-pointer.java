/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Map<Node,Node> map=new HashMap<>();
    public Node copyRandomList(Node head) {
    Node result=null;
    Node resHead=null;
    Node origNode=head;    
    while(head!=null)
    {
      if(result==null)
      {
          result=new Node(head.val);
          resHead=result;
          map.put(head,result);
      }
        else
        {
            Node temp=new Node(head.val);
            result.next=temp;
            map.put(head,temp);
            result=result.next;
        }   
        head=head.next;    
    }
    Node start=resHead;
    while(start!=null && origNode!=null)
    {
        start.random=map.get(origNode.random);
        start=start.next;
        origNode=origNode.next;
    }
     return resHead;   
        
    }
}