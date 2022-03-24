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
        if(root==null)
            return null;
        Node dummy=new Node(-2000);
        Queue<Node> queue=new ArrayDeque<>();
        queue.offer(root);
        queue.offer(dummy);
        while(queue.size()>0)
        {
            Node node=queue.poll();
            if(node!=dummy)
            {
                Node nextNode=queue.peek();
                if(nextNode!=dummy)
                    node.next=nextNode;
                else
                    node.next=null;
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }   
            else
            {
                if(queue.size()>0)
                    queue.offer(dummy);
            }
        }
        return root;
    }
}