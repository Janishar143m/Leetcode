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
     Map<Node,Node>map=new HashMap<>();
    public void fixRandomPointers(Node head)
    {
        Node node=head;
        while(node!=null)
        {
            map.get(node).random=map.get(node.random);
            node=node.next;
        }
        
    }
    public Node copyNodes(Node head)
    {
         Node node=head;
        Node result=null;
     Node resultHead=null;
        while(node!=null)
        {
            Node temp=new Node(node.val);
            map.put(node,temp);
            if(resultHead==null)
            {
                result=temp;
                resultHead=result;
            }
            else
            {
                result.next=temp;
                result=result.next;
            }    
            
            node=node.next;
        }
        return resultHead;
    }
    public Node copyRandomList(Node head) {
       Node result=null;
        result=copyNodes(head);
        fixRandomPointers(head);
        return result;
        
    }
}