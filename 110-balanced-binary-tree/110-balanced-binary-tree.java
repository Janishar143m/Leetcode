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
    Boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        
        isBalancedUtil(root);
        return flag;
        
    }
    public int isBalancedUtil(TreeNode root)
    {
         if(root==null)
             return 0;
         int left=isBalancedUtil(root.left);
         int right=isBalancedUtil(root.right);
         int diff=Math.max(left-right,right-left);
         if(diff>1)
             flag=false;
         return Math.max(left,right)+1;
    }
}