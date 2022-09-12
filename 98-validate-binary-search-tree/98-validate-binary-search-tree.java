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
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)
            return true;
        return isValidUtil(root,null,null);
        
    }
    private boolean isValidUtil(TreeNode root,TreeNode left,TreeNode right)
    {
        if(root==null)
            return true;
        if ((left!=null && root.val<=left.val)||(right!=null && root.val>=right.val))
            return false;
         return isValidUtil(root.left,left,root)&& isValidUtil(root.right,root,right);   
            
    }
}