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
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node prev=null;
        Node node=head;
        Node first=null;
        while(node!=null)
        {
            Node node1=new Node(node.val);
            if(first==null)
                first=node1;
            if(prev!=null)
                prev.next=node1;
            map.put(node,node1);
            prev=node1;
            node=node.next;
        }
       
        while(head!=null)
        {
            map.get(head).random=map.get(head.random);
            head=head.next;
        }
        return first;
        
        
    }
}