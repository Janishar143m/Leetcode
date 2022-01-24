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
    public Node copyNextItems(Node head)
    {
         Node result=null;
       Node resHead=null;
        Node temp=head;
         while(temp!=null)
    {
      if(result==null)
      {
          result=new Node(temp.val);
          resHead=result;
          map.put(temp,result);
      }
        else
        {
            Node temp1=new Node(temp.val);
            result.next=temp1;
            map.put(temp,temp1);
            result=result.next;
        }   
        temp=temp.next;    
    }
        return resHead;
    }
    public Node copyRandomLinks(Node newHead,Node origHead)
    {
        Node newNode=newHead;
        Node origNode=origHead;
         while(newNode!=null && origNode!=null)
    {
        newNode.random=map.get(origNode.random);
        newNode=newNode.next;
        origNode=origNode.next;
    }
     return newHead;   
    }   
    public Node copyRandomList(Node head) {   
    Node node=copyNextItems(head);
    Node result=copyRandomLinks(node,head);
    return result;    
   
        
    }
}