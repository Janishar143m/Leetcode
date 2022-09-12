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
class Solution {
   
    private  int count=0;
    public int goodNodes(TreeNode root) 
    {
       TreeNode prev=root;
        count=0;
       nodeEvaluate(root,prev);
        return count;
        
        
        
    }
    private void nodeEvaluate(TreeNode root,TreeNode prev)
    {
         if(root==null)
            return;
        if(root.val>=prev.val)
        {
            count+=1;
            prev=root;
        }
        nodeEvaluate(root.left,prev);
        nodeEvaluate(root.right,prev);
    
        
      
    }
}