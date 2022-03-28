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
        boolean result;
        result=isValidBSTUtil(root);
        return result;
    }
    public boolean isValidBSTUtil(TreeNode root)
    {
        if(root==null)
            return true;
        boolean leftBST=isValidBSTUtil(root.left);
        if(prev!=null && prev.val>=root.val)
            return false;
        prev=root;
        boolean rightBST=isValidBSTUtil(root.right);
        return leftBST&&rightBST;
    }
}