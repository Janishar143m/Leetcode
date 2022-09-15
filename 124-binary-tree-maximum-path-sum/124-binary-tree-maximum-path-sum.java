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
    private int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        maxPathUtil(root);
        return max;
        
    }
    
    private int maxPathUtil(TreeNode root)
    {
        
        if(root==null)
            return 0;
        int sum=0;
        int leftSum=maxPathUtil(root.left);
        if(leftSum>0)
            sum+=leftSum;
        int rightSum=maxPathUtil(root.right);
        if(rightSum>0)
            sum+=rightSum;
        sum+=root.val;
        max=Math.max(max,sum);
        return Math.max(Math.max(root.val+leftSum,root.val+rightSum),root.val);
    }   
}