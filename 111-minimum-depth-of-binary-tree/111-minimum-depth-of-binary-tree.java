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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int level=1;
        int result=minDepthUtil(root,level);
        return result;
        
    }
    public int minDepthUtil(TreeNode root,int level)
    {
       int leftLevel=level,rightLevel=level;
        if(root==null)
            return level-1;
          leftLevel=minDepthUtil(root.left,level+1);
         rightLevel=minDepthUtil(root.right,level+1);
        if(leftLevel==level && rightLevel==level)
            return level;
        if(leftLevel!=level && rightLevel==level)
            return leftLevel;
        if(rightLevel!=level && leftLevel==level)
            return rightLevel;
        else
        return Math.min(leftLevel,rightLevel);
         
        
    }
}