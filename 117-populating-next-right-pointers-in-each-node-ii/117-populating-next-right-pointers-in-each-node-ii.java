/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node node=root;
        Node dummy=new Node(-200);
        Node pre=dummy;
        while(node!=null)
        {
            if(node.left!=null)
            {
                pre.next=node.left;
                pre=pre.next;
            }
            if(node.right!=null)
            {
                pre.next=node.right;
                pre=pre.next;
            }
            if(node.left==null && node.right==null)
                pre.next=null;
            node=node.next;
            if(node==null)
            {
                pre=dummy;
                node=pre.next;
                //pre.next=null;
            }
        }
        
        return root;
        
    }
}