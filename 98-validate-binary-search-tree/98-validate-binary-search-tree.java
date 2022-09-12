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
     TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        
       
        return isValidBSTUtil(root);
        
    }
    
    private boolean isValidBSTUtil(TreeNode root)
    {
        if(root==null)
            return true;
        boolean left=isValidBSTUtil(root.left);
        if(!left)
            return false;
        if(prev!=null && prev.val>=root.val)
            return false;
        prev=root;
        boolean right=isValidBSTUtil(root.right);
        if(!right)
            return false;
        return true;
        
    }
}