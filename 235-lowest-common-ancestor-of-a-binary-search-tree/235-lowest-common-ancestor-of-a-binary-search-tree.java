/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
        TreeNode resultNode=root;
        if(root==null)
            return null;
       
       if((p.val<root.val && q.val<root.val))
            resultNode=lowestCommonAncestor(root.left,p,q);
        if ((p.val>root.val && q.val>root.val))
            resultNode=lowestCommonAncestor(root.right,p,q);
        
        return resultNode;
        
        
    }
}