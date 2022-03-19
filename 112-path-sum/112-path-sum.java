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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        boolean result=hasPathSumUtil(root,targetSum,0);
        return result;
        
    }
    private Boolean hasPathSumUtil(TreeNode root,int targetSum,int currentSum)
    {
         Boolean result=false,leftResult=false,rightResult=false;
         if(root.left==null && root.right==null && currentSum+root.val==targetSum)
            return true;
        if(root.left!=null)
           leftResult=hasPathSumUtil(root.left,targetSum,currentSum+root.val);
        if(root.right!=null)
            rightResult=hasPathSumUtil(root.right,targetSum,currentSum+root.val);
        return leftResult||rightResult;
        
    }
}