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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int level=1;
        int result=maxDepthUtil(root,level);
        return result;
        
    }
    public int maxDepthUtil(TreeNode root,int level)
    {
       int leftLevel=level,rightLevel=level;
        if(root.left!=null)
          leftLevel=maxDepthUtil(root.left,level+1);
        if(root.right!=null)
         rightLevel=maxDepthUtil(root.right,level+1);
        if(leftLevel==level && rightLevel==level)
            return level;
        if(leftLevel!=level && rightLevel==level)
            return leftLevel;
        if(rightLevel!=level && leftLevel==level)
            return rightLevel;
        else
        return Math.max(leftLevel,rightLevel);
         
        
    }
}