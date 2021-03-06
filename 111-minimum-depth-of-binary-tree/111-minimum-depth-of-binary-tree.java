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
        int level=0;
        if(root==null)
             return 0;
        int leftLevel=minDepth(root.left);
        int rightLevel=minDepth(root.right);
        return ((leftLevel==0||rightLevel==0)?leftLevel+rightLevel+1:Math.min(leftLevel,rightLevel)+1);
        
    }
}