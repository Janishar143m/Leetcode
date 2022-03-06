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
        Queue<Node> queue=new ArrayDeque<Node>();
        Node dummy=new Node(-2000);
        queue.add(root);
        queue.add(dummy);
        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            Node nextNode=queue.peek();
            if(temp==dummy && !queue.isEmpty())
            {
                queue.add(dummy);
            }
            else
            {
                if(nextNode==dummy)
                    temp.next=null;
                else
                    temp.next=nextNode;
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            
        }
        return root;
        
    }
}