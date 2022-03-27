/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Pair
{
  TreeNode node;
  int pos;
  Pair(TreeNode node,int pos)
  {
      this.node=node;
      this.pos=pos;
  }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        int max_diameter=0;
        Queue<Pair> queue=new ArrayDeque<>();
        queue.add(new Pair(root,0));
        while(queue.size()>0)
        {
            Pair head=queue.peek();
            Pair tail=head;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                tail=queue.poll();
                if(tail.node.left!=null)
                    queue.add(new Pair(tail.node.left,tail.pos*2+1));
                if(tail.node.right!=null)
                    queue.add(new Pair(tail.node.right,tail.pos*2+2));
            }
            int length=tail.pos-head.pos+1;
            max_diameter=Math.max(max_diameter,length);
            
        }
        return max_diameter;
        
    }
}